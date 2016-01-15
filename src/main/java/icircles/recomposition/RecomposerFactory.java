package icircles.recomposition;

import icircles.abstractdescription.AbstractBasicRegion;
import icircles.abstractdual.AbstractDualEdge;
import icircles.abstractdual.AbstractDualGraph;
import icircles.abstractdual.AbstractDualNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 */
public final class RecomposerFactory {

    private static final Logger log = LogManager.getLogger(Recomposer.class);

    public static Recomposer newRecomposer(RecompositionStrategyType type) {
        switch (type) {
            case NESTED:
                return new BasicRecomposer(nested());
            case SINGLY_PIERCED:
                return new BasicRecomposer(singlyPierced());
            case DOUBLY_PIERCED:
                return new BasicRecomposer(doublyPierced());
            default:
                throw new IllegalArgumentException("Unknown strategy type: " + type);
        }
    }

    private static RecompositionStrategy nested() {
        return zonesToSplit -> zonesToSplit.stream()
                .map(Cluster::new)
                .collect(Collectors.toList());
    }

    // Look for pairs of AbstractBasicRegions which differ by just a
    // single AbstractCurve - these pairs are potential double-clusters
    private static RecompositionStrategy singlyPierced() {
        return zonesToSplit -> seekSinglePiercings(new AbstractDualGraph(zonesToSplit));
    }

    private static RecompositionStrategy doublyPierced() {
        return zonesToSplit -> seekDoublePiercings(zonesToSplit);
    }

    private static List<Cluster> seekNestedPiercings(AbstractDualGraph graph) {
        return graph.getNodes()
                .stream()
                .map(node -> {
                    log.trace("Adding nested cluster: " + node.getZone());
                    return new Cluster(node.getZone());
                })
                .collect(Collectors.toList());
    }

    private static List<Cluster> seekSinglePiercings(AbstractDualGraph adg) {
        List<Cluster> result = new ArrayList<>();
        for (AbstractDualEdge e = adg.getLowDegreeEdge(); e != null; e = adg.getLowDegreeEdge()) {
            Cluster c = new Cluster(e.from.getZone(), e.to.getZone());
            result.add(c);

            log.trace("Made single-pierced cluster: " + c);
            log.trace("Graph before trimming for cluster: " + adg);

            adg.removeNode(e.from);
            adg.removeNode(e.to);

            log.trace("Graph after trimming for cluster: " + adg);
        }

        if (adg.getNumEdges() != 0)
            throw new RuntimeException("Non-empty adg edge set");

        result.addAll(seekNestedPiercings(adg));
        return result;
    }

    private static List<Cluster> seekDoublePiercings(List<AbstractBasicRegion> zonesToSplit) {
        // Look for four-tuples of AbstractBasicRegions which differ by
        // two AbstractCurves - these four-tuples are potential double-clusters
        List<Cluster> result = new ArrayList<>();

        AbstractDualGraph adg = new AbstractDualGraph(zonesToSplit);

        log.trace("Zones to split: " + zonesToSplit);

        for (List<AbstractDualNode> nodes = adg.getFourTuple(); nodes != null; nodes = adg.getFourTuple()) {
            if (nodes.isEmpty()) {
                break;
            }

            Cluster c = new Cluster(nodes.get(0).getZone(),
                    nodes.get(1).getZone(),
                    nodes.get(2).getZone(),
                    nodes.get(3).getZone());
            result.add(c);

            log.trace("Made cluster: " + c);
            log.trace("Graph before trimming for cluster: " + adg);

            adg.removeNode(nodes.get(0));
            adg.removeNode(nodes.get(1));
            adg.removeNode(nodes.get(2));
            adg.removeNode(nodes.get(3));

            log.trace("Graph after trimming for cluster: " + adg);
        }

        result.addAll(seekSinglePiercings(adg));

        return result;
    }
}
