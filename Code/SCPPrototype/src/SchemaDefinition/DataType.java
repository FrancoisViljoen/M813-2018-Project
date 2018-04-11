/*
 * License terms to be defined.
 * Currently - Copyright Reserved 2018
 * Francois Viljoen
 */
package SchemaDefinition;

/**
 * Enumerated type for the data types supported.  
 * All other data types can be represented as String, and will have no effect on 
 * application created.
 * @author Francois Viljoen
 */
public enum DataType {
    /** String or Textual data*/
    STRING, 
    /** Dates or Date time based data*/
    DATETIME, 
    /** Integers*/
    INT, 
    /** Floating point numbers*/
    DOUBLE
}
