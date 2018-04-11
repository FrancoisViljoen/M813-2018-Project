/*
 * License terms to be defined.
 * Currently - Copyright Reserved 2018
 * Francois Viljoen
 */
package SchemaDefinition;

/**
 * Representation of a Database Field in a schema used for dynamic application 
 * creation.
 * @author Francois Viljoen
 */
public interface IField {
    /** Gets the data type for this field
     *@return The Datatype*/
    DataType getDataType();
    
    /**Gets the name of the field
     @return  The Name of the Field in the database schema*/
    String getName();
    
    /**Gets an indication whether or not this field is a Primary Key Field.
     * @return A Boolean Value of True if the field is a Primary Key.
     */
    Boolean getIsPrimaryKey();
    
    /**Gets the number of unique values in this database field.
     * Typically done by means of a COUNT(DISTINCT NAME) Query on this field.
     * @return the number of unique values.
     */
    int getUniqueValueCount();
    
    /**Gets the number of unique number of values for the concatenated 
     * values for both fields.
     * Can be done as a COUNT(DISTINCT Field + otherField) Query.
     * @param otherField Field to include in the distinct count
     * @return The number of unique values for both fields.
     */
    int GetCombinedChangedCount(IField otherField);
}
