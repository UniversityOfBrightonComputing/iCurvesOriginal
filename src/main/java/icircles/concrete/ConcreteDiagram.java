package icircles.concrete;

import icircles.abstractdescription.AbstractDescription;
import icircles.decomposition.Decomposer;
import icircles.decomposition.DecompositionStep;
import icircles.decomposition.DecompositionType;
import icircles.recomposition.Recomposer;
import icircles.recomposition.RecompositionStep;
import icircles.recomposition.RecompositionType;
import icircles.util.CannotDrawException;

import java.awt.geom.Rectangle2D;
import java.util.Iterator;
import java.util.List;

/**
 * Represents a diagram at the concrete level.
 * Technically, this is a concrete form of AbstractDescription.
 */
public class ConcreteDiagram {

    private Rectangle2D.Double box;
    private List<CircleContour> circles;
    private List<ConcreteZone> shadedZones;

    public ConcreteDiagram(Rectangle2D.Double box,
            List<CircleContour> circles,
            List<ConcreteZone> shadedZones) {
        this.box = box;
        this.circles = circles;
        this.shadedZones = shadedZones;
    }

    /**
     * Constructs a concrete form of an abstract diagram.
     *
     * @param description the description to be drawn
     * @param size the size of the concrete diagram
     * @param dType decomposition type
     * @param rType recomposition type
     * @throws CannotDrawException if diagram cannot be drawn with given parameters
     */
    public ConcreteDiagram(AbstractDescription description, int size,
                           DecompositionType dType, RecompositionType rType) throws CannotDrawException {

        Decomposer d = new Decomposer(dType);
        List<DecompositionStep> dSteps = d.decompose(description);

        Recomposer r = new Recomposer(rType);
        List<RecompositionStep> rSteps = r.recompose(dSteps);

        DiagramCreator dc = new DiagramCreator(dSteps, rSteps);
        ConcreteDiagram diagram = dc.createDiagram(size);

        this.box = diagram.box;
        this.circles = diagram.circles;
        this.shadedZones = diagram.shadedZones;
    }

    /**
     * @return bounding box of the whole diagram
     */
    public Rectangle2D.Double getBox() {
        return box;
    }

    /**
     * @return diagram contours
     */
    public List<CircleContour> getCircles() {
        return circles;
    }

    /**
     * @return extra zones
     */
    public List<ConcreteZone> getShadedZones() {
        return shadedZones;
    }

    public static double checksum(List<CircleContour> circles) {
        double result = 0.0;
        if (circles == null) {
            return result;
        }

        Iterator<CircleContour> cIt = circles.iterator();
        while (cIt.hasNext()) {
            CircleContour c = cIt.next();
            result += c.cx * 0.345 + c.cy * 0.456 + c.radius * 0.567 + c.ac.checksum() * 0.555;
            result *= 1.2;
        }
        return result;
    }

    public String toDebugString() {
        return "ConcreteDiagram[box=" + box + "\n"
                + "contours: " + circles + "\n"
                + "shaded zones: " + shadedZones + "]";
    }

    @Override
    public String toString() {
        return toDebugString();
    }
}
