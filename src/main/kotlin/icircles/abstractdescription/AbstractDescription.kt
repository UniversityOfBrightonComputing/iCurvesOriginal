package icircles.abstractdescription

import java.util.*
import java.util.stream.Collectors

/**
 *
 *
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
data class AbstractDescription(private val curvesInternal: Set<AbstractCurve>, private val zonesInternal: Set<AbstractBasicRegion>) {

    val curves: Set<AbstractCurve>
    val zones: Set<AbstractBasicRegion>

    init {
        curves = Collections.unmodifiableSet(curvesInternal)
        zones = Collections.unmodifiableSet(zonesInternal)
    }

    fun getNumZonesIn(curve: AbstractCurve) = zones.filter { it.contains(curve) }.count()

    fun includesLabel(label: String) = curves.contains(AbstractCurve(label))

    fun includesZone(zone: AbstractBasicRegion) = zones.contains(zone)

    /**
     * @return abstract description in informal string form
     */
    fun getInformalDescription(): String {
        val sb = StringBuilder();
        for (zone in zones) {
            for (curve in zone.inSet) {
                sb.append(curve.label);
            }

            sb.append(" ");
        }

        return sb.toString().trim();
    }

    override fun toString() = zones.map { it.toString() }.joinToString(",")

    companion object {
        @JvmStatic fun from(informalDescription: String): AbstractDescription {
            val tmpZones = HashSet<AbstractBasicRegion>()
            tmpZones.add(AbstractBasicRegion.OUTSIDE);

            informalDescription.split(" +".toRegex())
                    .map { it.map { AbstractCurve(it.toString()) } }
                    .map { AbstractBasicRegion(it.toSet()) }
                    .forEach { tmpZones.add(it) }

            return AbstractDescription(tmpZones.flatMap { it.inSet }.toSet(), tmpZones)

//            val curves = HashMap<String, AbstractCurve>()
//
//            for (zoneName in informalDescription.split(" +")) {
//                val zoneCurves = TreeSet<AbstractCurve>()
//
//                for (k in zoneName.toCharArray()) {
//                    val label = k.toString()
//
//                    zoneCurves.add(AbstractCurve(label))
//                }
//
//                tmpZones.add(AbstractBasicRegion(zoneCurves));
//            }
//
//            return AbstractDescription(curves.values.toSet(), tmpZones)
        }
    }
}