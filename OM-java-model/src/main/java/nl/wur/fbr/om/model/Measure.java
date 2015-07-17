package nl.wur.fbr.om.model;

/**
 * This interface represents a value expressed in a unit.
 * For some measurements like temperature (if it is not relative, i.e. difference between temperatures),
 * {@link Point Point} should be used instead of <code>Measure</code> as these measurements are defined on a
 * measurement scale.
 *
 * @author Don Willems on 14/07/15.
 */
public interface Measure extends NamedObject {

    /**
     * The unit in which the measure is epressed.
     * @return The unit or measurement scale.
     */
    public Unit getUnit();

    /**
     * The numerical value of the measure.
     * The return type is an Object but can be of type Number, or (in the future) of Vector or Tensor types.
     * @return The numerical value.
     */
    public Object getNumericalValue();
}
