package nl.wur.fbr.om.core.set.quantities.electricity;

import nl.wur.fbr.om.core.impl.quantities.AbstractQuantity;
import nl.wur.fbr.om.core.set.quantities.CoreQuantitySet;
import nl.wur.fbr.om.exceptions.QuantityCreationException;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.quantities.QuantityClass;

/**
 * Instances of this class represent an Electrical Conductance quantity.
 *
 * @author Don Willems on 05/10/15.
 */
public class ElectricalConductance extends AbstractQuantity{

    /**
     * Creates an Electrical Conductance quantity without a measure, i.e. this quantity is a variable.
     * An identifier will be automatically generated.
     */
    public ElectricalConductance() {
        super();
    }

    /**
     * Creates an Electrical Conductance quantity with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the quantity.
     * @throws QuantityCreationException When the dimension of the quantity did not match the
     *                                   dimension of the unit of the measure.
     */
    public ElectricalConductance(Measure measure) throws QuantityCreationException {
        super(measure);
    }

    /**
     * Creates an Electrical Conductance quantity without a measure as value, i.e. this quantity is variable.
     * An identifier will be automatically generated.
     *
     * @param name    The name of the quantity.
     * @param symbol  The symbol used for the quantity.
     */
    public ElectricalConductance(String name, String symbol) {
        super(name, symbol);
    }

    /**
     * Creates an Electrical Conductance quantity with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param name    The name of the quantity.
     * @param symbol  The symbol used for the quantity.
     * @param measure The value of the quantity.
     * @throws QuantityCreationException When the dimension of the quantity did not match the
     *                                   dimension of the unit of the measure.
     */
    public ElectricalConductance(String name, String symbol, Measure measure) throws QuantityCreationException {
        super(name, symbol, measure);
    }

    /**
     * Returns the {@link QuantityClass} for which this quantity is an instance.
     *
     * @return The quantity class.
     */
    @Override
    public QuantityClass getQuantityClass() {
        return CoreQuantitySet.ELECTRICAL_CONDUCTANCE;
    }
}
