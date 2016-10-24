import java.util.InputMismatchException;

/**
 * CSC 1600 Data Structures
 * CH2 Programming Lab
 *
 * The EmployeeYoung is an
 *
 * @author Brandon Young
 */
// File Name: EmployeeYoung.java
public abstract class EmployeeYoung extends RuntimeException{

    // Generic employee fields
    private String name, address, ssn, department;

    /**
     * This is the parametrized constructor for the EmployeeYoung class.
     *
     * @param name String: The name of the Employee
     * @param address String: The address of the Employee
     * @param ssn String: The social security number of the Employee
     * @param department String: The department the Employee works in
     */
    public EmployeeYoung (String name, String address, String ssn, String department) {
        setName(name);
        setAddress(address);
        setSSN(ssn);
        setDepartment(department);
    }

    /**
     *  The getName method returns the name of the Employee
     *  Precondition: None
     *  Post Condition: Returns the name of the Employee
     * @return (String): The name of the Employee
     */
    public String getName() {
        return name;
    } // end getName

    /**
     * The setName method allows you to set the name of the employee
     * Precondition: name is a String
     * Post Condition: Sets the name of the Employee
     * @param name String: The name of the Employee
     */
    private void setName(String name) {
        this.name = name;
    } // end setName

    /**
     * The getAddress method returns the Employee address
     * Precondition: none
     * Post Condition: retuns the Employee address
     * @return (String): The address of the Employee
     */
    public String getAddress() {
        return address;
    } // end getAddress

    /**
     * The setAdress method sets the Employee address
     * Precondition: address is a String
     * Post Condition: sets the Employee address
     * @param address String: The employee address
     */
    private void setAddress(String address) {
        this.address = address;
    } // end setAddress

    /**
     * The getSSN method returns the Employees SSN Number
     * Precondition: none
     * Post Condition: retuns the Employee ssn number
     * @return (String): The employee SSN number
     */
    public String getSSN() {
        return ssn;
    } // end getSSN

    /**
     * The setSSN method allows you to set the Employee SSN
     * Precondition: ssn must be a string & ssn.length() == 9
     * @param ssn String: The SSN of the Employee
     */
    private void setSSN(String ssn) {
        if (ssn.length() == 9) {
            this.ssn = ssn;
        } else {
            throw new InputMismatchException("InputMismatchException: String too long");
        } // end if else
    } // end setSSN

    /**
     * The getDepartment method returns the department that the employee works in
     * Precondition: none
     * Post Condition: Returns the department the employee works in ex. sales, marketing.
     * @return (String): The department the employee works in
     */
    public String getDepartment() {
        return department;
    } // end getDepartment

    /**
     * The setDepartment method sets the department the employee works in
     * Precondition: department is a String
     * Post Condition: Sets the department the employee works in
     * @param department String: The department the employee works in.
     */
    private void setDepartment(String department) {
        this.department = department;
    } // end setDepartment

    /**
     * The pay method returns the pay of the employee
     * Precondition: none
     * Post Condition:
     * @return (double): The pay of the employee
     */
    public abstract double pay();

} // end EmployeeYoung
