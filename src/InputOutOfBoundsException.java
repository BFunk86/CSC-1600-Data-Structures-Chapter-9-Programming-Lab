/**
 * CSC 1600 Data Structures
 * CH2 Programming Lab
 *
 * The InputOutOfBoundsException is used to throw an RuntimeException when the user input is whithin
 * the specified bounds
 *
 * @author Brandon Young
 */
public class InputOutOfBoundsException extends RuntimeException {

    /**
     * The InputOutOfBoundsException is the default constructor for the InputOutBoundsException
     * Precondition: None
     * Post Condition: s is a String
     * @param s String: The error message to read back to the user
     */
    public InputOutOfBoundsException (String s){
        super(s);
    } // end InputOutOfBoundsException constructor
} // end InputOutOfBoundsException class
