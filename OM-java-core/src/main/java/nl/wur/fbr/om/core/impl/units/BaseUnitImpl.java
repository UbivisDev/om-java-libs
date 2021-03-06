package nl.wur.fbr.om.core.impl.units;

import nl.wur.fbr.om.model.dimensions.BaseDimension;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.units.BaseUnit;

/**
 * This class implements a base unit.
 * A Base unit is a unit for which the dimension is explicitly defined. It does not depend on the definition of
 * another unit. The metre, is for example, a base unit with dimension length (L).
 *
 *
 * @author Don Willems on 02/08/15.
 */
public class BaseUnitImpl extends SingularUnitImpl implements BaseUnit {

    /** The dimension in which this unit is defined. */
    private BaseDimension definitionDimension;

    /**
     * Creates a unit that is a base unit in some system of units.
     * @param dimension The dimension in which the unit is defined.
     */
    public BaseUnitImpl(BaseDimension dimension){
        super();
        definitionDimension = dimension;
    }

    /**
     * Creates a singular unit with the specified name and symbol that is a base unit in some system of units.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param dimension The dimension in which the unit is defined.
     */
    public BaseUnitImpl(String name, String symbol, BaseDimension dimension){
        super(name,symbol);
        this.definitionDimension = dimension;
    }

    /**
     * Creates a singular unit with the specified identifier, name, and symbol, that is a base unit in some system of units.
     * @param identifier The unique identifier for this unit.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param dimension The dimension in which the unit is defined.
     */
    public BaseUnitImpl(String identifier, String name, String symbol, BaseDimension dimension){
        super(identifier,name,symbol);
        this.definitionDimension = dimension;
    }

    /**
     * Returns the dimension in which this base unit is defined. For instance the SI base unit metre is defined
     * in the SI dimension for length (L).
     *
     * @return The dimension of the unit.
     */
    @Override
    public BaseDimension getDefinitionDimension() {
        return definitionDimension;
    }

    /**
     * Returns the dimensions, and therefore, the dimensional exponents, in which this unit is defined.<br>
     * The dimensions of the derived units are written as products of powers of the dimensions of the
     * base units using the equations that relate the derived units to the base units or
     * quantities. In SI the dimension of any unit U is written in the form of a dimensional product,
     * dim U = L^&#945; M^&#946; T^&#947; l^&#948; &#920;^&#949; N^&#950; J^eta
     * where the exponents &#945;, &#946;, &#947;, &#948;, &#949;, &#950;, and &#951;, which are generally small integers
     * which can be positive, negative or zero, are called the dimensional exponents.
     *
     * @return The set of dimensions and dimensional exponents.
     */
    @Override
    public Dimension getUnitDimension() {
        Dimension map = new Dimension();
        if(definitionDimension!=null) map.setDimensionalExponent(definitionDimension,1);
        return map;
    }
}
