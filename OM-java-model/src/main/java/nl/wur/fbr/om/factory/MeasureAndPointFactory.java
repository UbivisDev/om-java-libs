package nl.wur.fbr.om.factory;

import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.Unit;
import org.apache.commons.lang3.Range;

/**
 * This interface defines methods that can be used to create measures and points on a measurement scale.
 * Each library that implements the model classes should also provide an implementation of the
 * <code>MeasureAndPointFactory</code> to create instances from its own implementation classes.
 *
 *
 * @author Don Willems on 21/07/15.
 */
public interface MeasureAndPointFactory {

    /**
     * Creates a new measure with the specified numerical value expressed in the specified unit.
     * If the numerical value is of type Number, a ScalarMeasure will be created, if the numerical
     * value is an array of numbers, a VectorMeasure will be created.
     * @param numericalValue The numerical value.
     * @param unit The unit.
     * @return A measure with the specified value expressed in the specified unit.
     */
    public Measure createMeasure(Object numericalValue, Unit unit);

    /**
     * Creates a new scalar measure with the specified numerical value expressed in the specified unit.
     * @param value The scalar value of the measure.
     * @param unit The unit in which the scalar is expressed.
     * @return The scalar measure.
     */
    public Measure createScalarMeasure(double value, Unit unit);

    /**
     * Creates a new scalar measure with a range with the specified minimum and maximum values
     * expressed in the specified unit.
     * @param minimumValue The minimum value of the measure.
     * @param maximumValue The maximum value of the measure.
     * @param unit The unit in which the scalar is expressed.
     * @return The scalar measure.
     */
    public Measure createScalarRangeMeasure(double minimumValue,double maximumValue, Unit unit);

    /**
     * Creates a new scalar measure with the specified range in the specified unit.
     * @param range The scalar range of the measure.
     * @param unit The unit in which the scalar is expressed.
     * @return The scalar measure.
     */
    public Measure createScalarRangeMeasure(Range range, Unit unit);

    /**
     * Creates a new vector measure with the specified vector value expressed int the specified unit.
     * @param vector The vector value of the measure expressed as an array of numbers.
     * @param unit The unit in which the vector is expressed.
     * @return The vector measure.
     */
    public Measure createVectorMeasure(double[] vector, Unit unit);

    /**
     * Creates a new scalar point on a measurement scale with the specified numerical value on the specified measurement
     * scale and using the unit associated with that scale.
     * @param value The value of the scale.
     * @param scale The scale in which this point is defined.
     * @return The point.
     */
    public Point createPoint(Object value, Scale scale);

    /**
     * Creates a new scalar point on a measurement scale with the specified scalar value on the specified measurement
     * scale and using the unit associated with that scale.
     *
     * @param value The scalar value of the point.
     * @param scale The scale in which this point is defined.
     * @return The scalar point.
     */
    public Point createScalarPoint(double value,Scale scale);

    /**
     * Creates a new scalar point with a range with the specified minimum and maximum values
     * expressed on the specified measurement
     * scale and using the unit associated with that scale.
     * @param minimumValue The minimum value of the point.
     * @param maximumValue The maximum value of the point.
     * @param scale The scale in which this point is defined.
     * @return The scalar range point.
     */
    public Point createScalarRangePoint(double minimumValue,double maximumValue,Scale scale);

    /**
     * Creates a new scalar point with the specified range on the specified measurement
     * scale and using the unit associated with that scale.
     * @param range The scalar range of the point.
     * @param scale The scale in which this point is defined.
     * @return The scalar range point.
     */
    public Point createScalarRangePoint(Range range,Scale scale);

    /**
     * Creates a new vector point on a measurement scale with the specified vector value on the specified measurement
     * scale and using the unit associated with that scale.
     *
     * @param vector The vector value of the point expressed as an array of numbers.
     * @param scale The scale in which this point is defined.
     * @return The vector point.
     */
    public Point createVectorPoint(double[] vector, Scale scale);

}
