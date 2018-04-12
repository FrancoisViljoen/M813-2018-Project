/*
 * License terms to be defined.
 * Currently - Copyright Reserved 2018
 * Francois Viljoen
 */
package SchemaDefinition;

/**
 * Representation of a Relationship between two database tables.
 * Typically a Foreign Key, but could also be a manually defined
 * relationship.
 * 
 * @author Francois Viljoen
 */
public interface IDatabaseRelationship {
    /** Gets a reference to the parent field of the relationship. 
     * @return A reference to the parent field.
     */
    IField getParentField();
    
    /** Gets a reference to the child field of the relationship. 
     * @return A reference to the child field.
     */
    IField getChildField();
}
