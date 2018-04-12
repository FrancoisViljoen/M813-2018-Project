/*
 * License terms to be defined.
 * Currently - Copyright Reserved 2018
 * Francois Viljoen
 */
package SchemaDefinition;

/**
 * Representation of a database table in the schema used for dynamic application
 * creation.
 * @author Francois Viljoen
 */
public interface ITable {
    /** Gets the database name of this Table
     * 
     * @return  the table name.
     */
    public String getName();
    
    /** Gets a list of all the fields in this table
     * 
     * @return An array of fields.
     */
    public IField[] getFields();
  
}
