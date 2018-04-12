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
    
    /** Get a list of all the tables in this schema.
     * @return An Array of all the tables in this schema.
    */
    public ITable[] getTables();
    
    /**Gets a list of all the relationships in this schema.
     * 
     * @return a collection of all the relationships.
     */
    public IDatabaseRelationship[] getRelationships();
}
