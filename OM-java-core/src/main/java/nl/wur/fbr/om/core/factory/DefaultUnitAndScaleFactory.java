package nl.wur.fbr.om.core.factory;

import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.*;
import nl.wur.fbr.om.prefixes.DecimalPrefix;

/**
 * @author Don Willems on 19/07/15.
 */
public class DefaultUnitAndScaleFactory implements UnitAndScaleFactory{

    /**
     * Implementations should return a unit or scale identified by the specified
     * identifier. If the Unit or Scale with the same identifier has been created previously, this method should return the
     * same instance. If the Unit or Scale has not been created previously, this method should create the
     * unit or scale and set the identifier of the unit or scale to the specified identifier. The data needed to
     * create the unit (such as multiplication factors, prefixes, or base units) or scale may be available from other sources
     * such as the OM ontology. If the data for creating a new instance is not available, this method should return null.
     * If the object identified by the specified identifier is not a unit or scale, this method should also return null.
     *
     * @param identifier The identifier of the unit or scale.
     * @return The unit or scale identified by the specified identifier.
     */
    @Override
    public Object getUnitOrScale(String identifier) {
        return null;
    }

    /**
     * Creates a new singular base unit.
     * For instance the metre unit is a base unit in SI and does not have a definition unit.
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @return The requested singular base unit.
     */
    @Override
    public SingularUnit createBaseUnit() {
        return null;
    }

    /**
     * Creates a new singular base unit.
     * For instance the metre unit is a base unit in SI and does not have a definition unit.
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name   The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @return The requested singular unit.
     */
    @Override
    public SingularUnit createBaseUnit(String name, String symbol) {
        return null;
    }

    /**
     * Creates a new singular base unit.
     * For instance the metre unit is a base unit in SI and does not have a definition unit.
     *
     * @param identifier A unique identifier for the unit.
     * @param name       The preferred name of the unit.
     * @param symbol     The symbol used for the unit.
     * @return The requested singular unit.
     */
    @Override
    public SingularUnit createBaseUnit(String identifier, String name, String symbol) {
        return null;
    }

    /**
     * Creates a new singular unit defined to be the same as the definition unit.
     * For instance the Pascal unit has as definition unit kilogram per metre second squared (kg m^-1 s^-1).
     * No multiplication (definitionFactor) factor is needed to convert between Pascal and kilogram per metre second
     * squared, i.e. 1 Pa = 1 kg m^-1 s^-1.
     *
     * @param definitionUnit The unit relative to which this unit is defined.
     * @return The requested singular unit.
     */
    @Override
    public SingularUnit createSingularUnit(Unit definitionUnit) {
        return null;
    }

    /**
     * Creates a new singular unit defined to be the same as the definition unit.
     * For instance the Pascal unit has as definition unit kilogram per metre second squared (kg m^-1 s^-1).
     * No multiplication (definitionFactor) factor is needed to convert between Pascal and kilogram per metre second
     * squared, i.e. 1 Pa = 1 kg m^-1 s^-1.
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name           The preferred name of the unit.
     * @param symbol         The symbol used for the unit.
     * @param definitionUnit The unit relative to which this unit is defined.
     * @return The requested singular unit.
     */
    @Override
    public SingularUnit createSingularUnit(String name, String symbol, Unit definitionUnit) {
        return null;
    }

    /**
     * Creates a new singular unit defined to be the same as the definition unit.
     * For instance the Pascal unit has as definition unit kilogram per metre second squared (kg m^-1 s^-1).
     * No multiplication (definitionFactor) factor is needed to convert between Pascal and kilogram per metre second
     * squared, i.e. 1 Pa = 1 kg m^-1 s^-1.
     *
     * @param identifier     A unique identifier for the unit.
     * @param name           The preferred name of the unit.
     * @param symbol         The symbol used for the unit.
     * @param definitionUnit The unit relative to which this unit is defined.
     * @return The requested singular unit.
     */
    @Override
    public SingularUnit createSingularUnit(String identifier, String name, String symbol, Unit definitionUnit) {
        return null;
    }

    /**
     * Returns a singular unit that is defined relative to the provided definition unit and related with this definition
     * unit with a multiplication factor as specied by the parameter <code>definitionFactor</code>.
     * For instance the astronomical unit is defined relative to the metre with a definition factor of 1.495978707e11,
     * i.e. 1 AU = 1.495978707e11 m.
     *
     * @param definitionUnit   The unit relative to which this unit is defined.
     * @param definitionFactor The multiplication factor.
     * @return The requested singular unit.
     */
    @Override
    public SingularUnit createSingularUnit(Unit definitionUnit, double definitionFactor) {
        return null;
    }

    /**
     * Returns a singular unit that is defined relative to the provided definition unit and related with this definition
     * unit with a multiplication factor as specied by the parameter <code>definitionFactor</code>.
     * For instance the astronomical unit is defined relative to the metre with a definition factor of 1.495978707e11,
     * i.e. 1 AU = 1.495978707e11 m.
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name             The preferred name of the unit.
     * @param symbol           The symbol used for the unit.
     * @param definitionUnit   The unit relative to which this unit is defined.
     * @param definitionFactor The multiplication factor.
     * @return The requested singular unit.
     */
    @Override
    public SingularUnit createSingularUnit(String name, String symbol, Unit definitionUnit, double definitionFactor) {
        return null;
    }

    /**
     * Returns a singular unit that is defined relative to the provided definition unit and related with this definition
     * unit with a multiplication factor as specied by the parameter <code>definitionFactor</code>.
     * For instance the astronomical unit is defined relative to the metre with a definition factor of 1.495978707e11,
     * i.e. 1 AU = 1.495978707e11 m.
     *
     * @param identifier       A unique identifier for the unit.
     * @param name             The preferred name of the unit.
     * @param symbol           The symbol used for the unit.
     * @param definitionUnit   The unit relative to which this unit is defined.
     * @param definitionFactor The multiplication factor.
     * @return The requested singular unit.
     */
    @Override
    public SingularUnit createSingularUnit(String identifier, String name, String symbol, Unit definitionUnit, double definitionFactor) {
        return null;
    }

    /**
     * Creates a new Unit multiple. A Unit multiple (or prefixed unit) has a base unit and a prefix factor which is
     * defined by its prefix. The prefix, kilo, for example has a prefix factor of 1000 and the prefix milli, has a
     * prefix factor of 0.001. This method should be used for predefined prefixes. For non-predefined prefixes use:
     * {@link #createUnitMultiple(Unit, double) createUnitMultiple(Unit,double} where the multiplication factor can
     * be specified.
     *
     * @param base   The base Unit that is prefixed.
     * @param prefix The prefix used for the unit.
     * @return The unit multiple.
     */
    @Override
    public UnitMultiple createUnitMultiple(Unit base, DecimalPrefix prefix) {
        return null;
    }

    /**
     * Creates a new Unit multiple. A Unit multiple (or prefixed unit) has a base unit and a prefix factor which is
     * defined by its prefix. The prefix, kilo, for example has a prefix factor of 1000 and the prefix milli, has a
     * prefix factor of 0.001. This method should be used for predefined prefixes. For non-predefined prefixes use:
     * {@link #createUnitMultiple(Unit, double) createUnitMultiple(Unit,double} where the multiplication factor can
     * be specified.
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name   The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param base   The base Unit that is prefixed.
     * @param prefix The prefix used for the unit.
     * @return The unit multiple.
     */
    @Override
    public UnitMultiple createUnitMultiple(String name, String symbol, Unit base, DecimalPrefix prefix) {
        return null;
    }

    /**
     * Creates a new Unit multiple. A Unit multiple (or prefixed unit) has a base unit and a prefix factor which is
     * defined by its prefix. The prefix, kilo, for example has a prefix factor of 1000 and the prefix milli, has a
     * prefix factor of 0.001. This method should be used for predefined prefixes. For non-predefined prefixes use:
     * {@link #createUnitMultiple(Unit, double) createUnitMultiple(Unit,double} where the multiplication factor can
     * be specified.
     *
     * @param identifier A unique identifier for the unit.
     * @param name       The preferred name of the unit.
     * @param symbol     The symbol used for the unit.
     * @param base       The base Unit that is prefixed.
     * @param prefix     The prefix used for the unit.
     * @return The unit multiple.
     */
    @Override
    public UnitMultiple createUnitMultiple(String identifier, String name, String symbol, Unit base, DecimalPrefix prefix) {
        return null;
    }

    /**
     * Creates a new Unit multiple. A Unit multiple (or prefixed unit) has a base unit and a prefix factor which is
     * defined by its prefix. The prefix, kilo, for example has a prefix factor of 1000 and the prefix milli, has a
     * prefix factor of 0.001. This method should be used for non-predefined prefixes. For predefined prefixes use:
     * {@link #createUnitMultiple(Unit, DecimalPrefix) createUnitMultiple(Unit,UnitPrefix}
     *
     * @param base         The base Unit that is prefixed.
     * @param prefixFactor The prefix multiplication factor.
     * @return The unit multiple.
     */
    @Override
    public UnitMultiple createUnitMultiple(Unit base, double prefixFactor) {
        return null;
    }

    /**
     * Creates a new Unit multiple. A Unit multiple (or prefixed unit) has a base unit and a prefix factor which is
     * defined by its prefix. The prefix, kilo, for example has a prefix factor of 1000 and the prefix milli, has a
     * prefix factor of 0.001. This method should be used for non-predefined prefixes. For predefined prefixes use:
     * {@link #createUnitMultiple(Unit, DecimalPrefix) createUnitMultiple(Unit,UnitPrefix}.
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name         The preferred name of the unit.
     * @param symbol       The symbol used for the unit.
     * @param base         The base Unit that is prefixed.
     * @param prefixFactor The prefix multiplication factor.
     * @return The unit multiple.
     */
    @Override
    public UnitMultiple createUnitMultiple(String name, String symbol, Unit base, double prefixFactor) {
        return null;
    }

    /**
     * Creates a new Unit multiple. A Unit multiple (or prefixed unit) has a base unit and a prefix factor which is
     * defined by its prefix. The prefix, kilo, for example has a prefix factor of 1000 and the prefix milli, has a
     * prefix factor of 0.001. This method should be used for non-predefined prefixes. For predefined prefixes use:
     * {@link #createUnitMultiple(Unit, DecimalPrefix) createUnitMultiple(Unit,UnitPrefix}.
     *
     * @param identifier   A unique identifier for the unit.
     * @param name         The preferred name of the unit.
     * @param symbol       The symbol used for the unit.
     * @param base         The base Unit that is prefixed.
     * @param prefixFactor The prefix multiplication factor.
     * @return The unit multiple.
     */
    @Override
    public UnitMultiple createUnitMultiple(String identifier, String name, String symbol, Unit base, double prefixFactor) {
        return null;
    }

    /**
     * Creates a unit that consists of a multiplication of two units, such as Newton metre (N.m).
     *
     * @param unit1 The first unit in the unit multiplication.
     * @param unit2 The second unit in the unit multiplication.
     * @return The unit multiplication.
     */
    @Override
    public UnitMultiplication createUnitMultiplication(Unit unit1, Unit unit2) {
        return null;
    }

    /**
     * Creates a unit that consists of a multiplication of two units, such as Newton metre (N.m).
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name   The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param unit1  The first unit in the unit multiplication.
     * @param unit2  The second unit in the unit multiplication.
     * @return The unit multiplication.
     */
    @Override
    public UnitMultiplication createUnitMultiplication(String name, String symbol, Unit unit1, Unit unit2) {
        return null;
    }

    /**
     * Creates a unit that consists of a multiplication of two units, such as Newton metre (N.m).
     *
     * @param identifier A unique identifier for the unit.
     * @param name       The preferred name of the unit.
     * @param symbol     The symbol used for the unit.
     * @param unit1      The first unit in the unit multiplication.
     * @param unit2      The second unit in the unit multiplication.
     * @return The unit multiplication.
     */
    @Override
    public UnitMultiplication createUnitMultiplication(String identifier, String name, String symbol, Unit unit1, Unit unit2) {
        return null;
    }

    /**
     * Creates a unit that consists of a division of two units, such as metre per second (m/s).
     * In the unit metre per second, metre is the numerator unit and second is the denominator unit.
     *
     * @param numerator   The unit used as numerator in the unit division.
     * @param denominator The unit used as denominator in the unit division.
     * @return The unit division.
     */
    @Override
    public UnitDivision createUnitDivision(Unit numerator, Unit denominator) {
        return null;
    }

    /**
     * Creates a unit that consists of a division of two units, such as metre per second (m/s).
     * In the unit metre per second, metre is the numerator unit and second is the denominator unit.
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name        The preferred name of the unit.
     * @param symbol      The symbol used for the unit.
     * @param numerator   The unit used as numerator in the unit division.
     * @param denominator The unit used as denominator in the unit division.
     * @return The unit division.
     */
    @Override
    public UnitDivision createUnitDivision(String name, String symbol, Unit numerator, Unit denominator) {
        return null;
    }

    /**
     * Creates a unit that consists of a division of two units, such as metre per second (m/s).
     * In the unit metre per second, metre is the numerator unit and second is the denominator unit.
     *
     * @param identifier  A unique identifier for the unit.
     * @param name        The preferred name of the unit.
     * @param symbol      The symbol used for the unit.
     * @param numerator   The unit used as numerator in the unit division.
     * @param denominator The unit used as denominator in the unit division.
     * @return The unit division.
     */
    @Override
    public UnitDivision createUnitDivision(String identifier, String name, String symbol, Unit numerator, Unit denominator) {
        return null;
    }

    /**
     * Creates a unit that consists of a exponentiation of its base unit.
     * For instance cubic metre (m^2) is a unit exponentiation with base unit metre (m) and exponent 2.
     *
     * @param base     The base unit.
     * @param exponent The exponent.
     * @return The unit exponentiation.
     */
    @Override
    public UnitExponentiation createUnitExponentiation(Unit base, double exponent) {
        return null;
    }

    /**
     * Creates a unit that consists of a exponentiation of its base unit.
     * For instance cubic metre (m^2) is a unit exponentiation with base unit metre (m) and exponent 2.
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name     The preferred name of the unit.
     * @param symbol   The symbol used for the unit.
     * @param base     The base unit.
     * @param exponent The exponent.
     * @return The unit exponentiation.
     */
    @Override
    public UnitExponentiation createUnitExponentiation(String name, String symbol, Unit base, double exponent) {
        return null;
    }

    /**
     * Creates a unit that consists of a exponentiation of its base unit.
     * For instance cubic metre (m^2) is a unit exponentiation with base unit metre (m) and exponent 2.
     *
     * @param identifier A unique identifier for the unit.
     * @param name       The preferred name of the unit.
     * @param symbol     The symbol used for the unit.
     * @param base       The base unit.
     * @param exponent   The exponent.
     * @return The unit exponentiation.
     */
    @Override
    public UnitExponentiation createUnitExponentiation(String identifier, String name, String symbol, Unit base, double exponent) {
        return null;
    }

    /**
     * Creates a new measurement scale that does not refer to any other measurement scale.
     *
     * @param unit The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    @Override
    public Scale createScale(Unit unit) {
        return null;
    }

    /**
     * Creates a new measurement scale that does not refer to any other measurement scale.
     * The identifier for the scale should be generated by the factory and should be unique.
     *
     * @param name   The preferred name of the scale.
     * @param symbol The symbol used for the scale.
     * @param unit   The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    @Override
    public Scale createScale(String name, String symbol, Unit unit) {
        return null;
    }

    /**
     * Creates a new measurement scale that does not refer to any other measurement scale.
     *
     * @param identifier A unique identifier for the scale.
     * @param name       The preferred name of the scale.
     * @param symbol     The symbol used for the scale.
     * @param unit       The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    @Override
    public Scale createScale(String identifier, String name, String symbol, Unit unit) {
        return null;
    }

    /**
     * Creates a new measurement scale that is defined by a transformation (using an offset and a multiplication factor)
     * of the specified definition scale.
     * The Fahrenheit measurement scale, for instance, has an offset of -459.67 and a multiplication factor of 1.8
     * relative to its definition scale which is the Kelvin scale. It uses the unit Fahrenheit.
     *
     * @param definitionScale      The definition scale.
     * @param definitionOffset     The offset of this scale with the definition scale.
     * @param multiplicationFactor The multiplication factor by which values in this scale need to be multiplied to
     *                             calculate the value in the definition scale.
     * @param unit                 The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    @Override
    public Scale createScale(Scale definitionScale, double definitionOffset, double multiplicationFactor, Unit unit) {
        return null;
    }

    /**
     * Creates a new measurement scale that is defined by a transformation (using an offset and a multiplication factor)
     * of the specified definition scale.
     * The Fahrenheit measurement scale, for instance, has an offset of -459.67 and a multiplication factor of 1.8
     * relative to its definition scale which is the Kelvin scale. It uses the unit Fahrenheit.
     * The identifier for the scale should be generated by the factory and should be unique.
     *
     * @param name                 The preferred name of the scale.
     * @param symbol               The symbol used for the scale.
     * @param definitionScale      The definition scale.
     * @param definitionOffset     The offset of this scale with the definition scale.
     * @param multiplicationFactor The multiplication factor by which values in this scale need to be multiplied to
     *                             calculate the value in the definition scale.
     * @param unit                 The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    @Override
    public Scale createScale(String name, String symbol, Scale definitionScale, double definitionOffset, double multiplicationFactor, Unit unit) {
        return null;
    }

    /**
     * Creates a new measurement scale that is defined by a transformation (using an offset and a multiplication factor)
     * of the specified definition scale.
     * The Fahrenheit measurement scale, for instance, has an offset of -459.67 and a multiplication factor of 1.8
     * relative to its definition scale which is the Kelvin scale. It uses the unit Fahrenheit.
     *
     * @param identifier           A unique identifier for the scale.
     * @param name                 The preferred name of the scale.
     * @param symbol               The symbol used for the scale.
     * @param definitionScale      The definition scale.
     * @param definitionOffset     The offset of this scale with the definition scale.
     * @param multiplicationFactor The multiplication factor by which values in this scale need to be multiplied to
     *                             calculate the value in the definition scale.
     * @param unit                 The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    @Override
    public Scale createScale(String identifier, String name, String symbol, Scale definitionScale, double definitionOffset, double multiplicationFactor, Unit unit) {
        return null;
    }
}
