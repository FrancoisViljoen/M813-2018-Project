/*
 * License terms to be defined.
 * Currently - Copyright Reserved 2018
 * Francois Viljoen
 */
package SchemaDefinition;

/**
 * Container object for a database schema.
 * @author Francois Viljoen
 */
public interface IDatabaseSchema {    
    public ITable[] getTables();
    
    public void setTables(ITable[] _tables);
}
