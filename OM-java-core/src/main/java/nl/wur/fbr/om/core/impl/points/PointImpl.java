package nl.wur.fbr.om.core.impl.points;


import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.scales.Scale;

/**
 * This class implements the {@link Point Point} interface that represents a point (value and scale) on a measurement scale.
 * The unit in which the value is expressed in defined in the measurement scale.
 *
 * These points can be used to define a measurement scale as in the Celsius scale, which is defined by
 * <code>Point</code>s such as the boiling point of water, or they can be used to specify measurements on a scale,
 * for instance the temperature in degree celsius. For measurements like temperature, a <code>Point</code> needs
 * to be used, e.g. the temperature is 10 degrees Celsius, while temperature differences need to be expressed as
 * {@link Measure Measure}s as these values are relative.
 *
 * @author Don Willems on 20/07/15.
 */
public class PointImpl implements Point{

    /** The scale in which this point is defined. */
    private Scale scale;

    /** The numerical value of this point on the scale. */
    private Object numericalValue;

    /**
     * Creates a new <code>Point</code> with the specified numerical value on the specified scale.
     * @param numericalValue The numerical value.
     * @param scale The scale.
     */
    public PointImpl(Object numericalValue, Scale scale){
        this.scale = scale;
        this.numericalValue = numericalValue;
    }

    /**
     * The scale in which this point is defined.
     *
     * @return The measurement scale in which the point is defined.
     */
    @Override
    public Scale getScale() {
        return scale;
    }

    /**
     * The numerical value of the point on the scale.
     *
     * @return The numerical value.
     */
    @Override
    public Object getNumericalValue() {
        return numericalValue;
    }

    /**
     * A string representation of this point, the string representation of the numerical value followed by the
     * symbol of the unit defined in the scale if not null. For instance, a point with value 15 in the kelvin scale,
     * will be represented as 15 K.
     * @return The
     */
    @Override
    public String toString(){
        String str = ""+numericalValue;
        if(getScale().getUnit()!=null && getScale().getUnit().getSymbol()!=null){
            str+= " " + getScale().getUnit().getSymbol();
        }
        return str;
    }
}