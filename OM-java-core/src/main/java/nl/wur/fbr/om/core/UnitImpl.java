package nl.wur.fbr.om.core;

import javafx.util.Pair;
import nl.wur.fbr.om.model.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Don Willems on 18/07/15.
 */
public class UnitImpl implements Unit{

    /** The identifier for this unit. */
    private String identifier;

    /**
     *  The list of names for this unit, the first name in the list is the preferred name.
     *  The items in the list are tuples with the value being the name and the key
     *  the ISO 639 language identifier, or "" if no language was set.
     */
    private List<Pair<String,String>> names = new ArrayList<>();

    /** The list of symbols for this unit, the first symbol in the list is the preferred symbol. */
    private List<String> symbols = new ArrayList<>();

    /**
     * Creates a new instance of a Unit with the specified name and symbol.
     * @param name The name of the unit.
     * @param symbol The symbol of the unit.
     */
    public UnitImpl(String name, String symbol) {
        super();
        identifier = UUID.randomUUID().toString();
    }

    /**
     * Returns the identifier for the specific object. This identifier should be unique
     * and should be used to compare object for equality.
     *
     * @return The identifier for the object.
     */
    @Override
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Returns the preferred name of the object or null if not set.
     *
     * @return The preferred name.
     */
    @Override
    public String getName() {
        if(names.size()<=0) return null;
        return names.get(0).getValue();
    }

    /**
     * Returns alternative names for the object not including the preferred name.
     * If no alternative names exist, an empty list should be returned.
     *
     * @return A list of alternative names.
     */
    @Override
    public List<String> getAlternativeNames() {
        List<String> altnames = new ArrayList<>();
        for (int i=1;i<names.size();i++){ // start ad i=1 to ignore the preferred name.
            altnames.add(names.get(i).getValue());
        }
        return altnames;
    }

    /**
     * Returns the preferred name in the specified language if it is known for this object.
     * If no name in the specified language is available return null.
     *
     * @param language The language of the requested name (ISO 639).
     * @return The preferred name.
     */
    @Override
    public String getName(String language) {
        for (int i=0;i<names.size();i++){ // iterate until name with language is found
            if (names.get(i).getKey().equals(language)){
                return  names.get(i).getValue();
            }
        }
        return null;
    }

    /**
     * Returns the alternative names in the specified language if any are known.
     * If no known alternative names are known return an empty list.
     *
     * @param language The language of the requested alternative names.
     * @return A list of alternative names.
     */
    @Override
    public List<String> getAlternativeNames(String language) {
        boolean found = false;
        List<String> altnames = new ArrayList<>();
        for (int i=0;i<names.size();i++){ // iterate over all names
            if (names.get(i).getKey().equals(language)) { // test for language
                if(!found) { // test whether this name is the first in the correct language, if so ignore
                    altnames.add(names.get(i).getValue()); // add when correct language
                }
                found = true;
            }
        }
        return altnames;
    }

    /**
     * Returns the preferred symbol used for this object.
     * When no symbol is known return null.
     *
     * @return The preferred symbol.
     */
    @Override
    public String getSymbol() {
        if(symbols.size()<=0) return null;
        return symbols.get(0);
    }

    /**
     * Returns a list of alternative symbols for this object.
     * When no known alternative symbols are known return an empty list.
     *
     * @return A list of alternative symbols.
     */
    @Override
    public List<String> getAlternativeSymbols() {
        List<String> altsymbols = new ArrayList<>();
        altsymbols.addAll(1,symbols);
        return altsymbols;
    }
}
