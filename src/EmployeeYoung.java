/**
 * CSC 1600 Data Structures
 * CH2 Programming Lab
 *
 * @author Brandon Young
 */
public abstract class EmployeeYoung {

    // Generic employee fields
    private String name, address, ssn, department;

    /**
     *  The getName method returns the name of the Employee
     *  Precondition: None
     *  Post Condition: Returns the name of the Employee
     * @return (String): The name of the Employee
     */
    public String getName() {
        return name;
    }

    /**
     * The setName method allows you to set the name of the employee
     * Precondition: name is a String
     * Post Condition: Sets the name of the Employee
     * @param name String: The name of the Employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The getAddress method returns the Employee address
     * Precondition: none
     * Post Condition: retuns the Employee address
     * @return (String): The address of the Employee
     */
    public String getAddress() {
        return address;
    }

    /**
     * The setAdress method sets the Employee address
     * Precondition: address is a String
     * Post Condition: sets the Employee address
     * @param address String: The employee address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * The getSSN method returns the Employees SSN Number
     * Precondition: none
     * Post Condition: retuns the Employee ssn number
     * @return (String): The employee SSN number
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * The setSSN method allows you to set the Employee SSN
     * Precondition: ssn must be a string & ssn.length() == 9
     * @param ssn String: The SSN of the Employee
     */
    public void setSSN(String ssn) {
        if (ssn.length() == 9)
            this.ssn = ssn;
        else
            throw
    }

    /**
     * The getDepartment method returns the department that the employee works in
     * Precondition: none
     * Post Condition: Returns the department the employee works in ex. sales, marketing.
     * @return (String): The department the employee works in
     */
    public String getDepartment() {
        return department;
    }

    /**
     * The setDepartment method sets the department the employee works in
     * Precondition: department is a String
     * Post Condition: Sets the department the employee works in
     * @param department String: The department the employee works in.
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * The pay method returns the pay of the employee
     * Precondition:
     * Post Condition:
     * @return (double): The pay of the employee
     */
    public abstract double pay();
}
