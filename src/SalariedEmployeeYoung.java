import static java.lang.String.format;

/**
 * CSC 1600 Data Structures
 * CH2 Programming Lab
 *
 * @author Brandon Young
 */
// File Name: SalariedEmployeeYoung.java
public class SalariedEmployeeYoung extends EmployeeYoung{

    // The employees monthly salary
    private double salary;
    // The employees un-paid leave time
    private double leave;
    // The minimum possible monthly salary based on minimum wage x 160 hours
    private final double MIN_SALARY = 1160;

    /**
     * The default constructor creates an object of the SalariedEmployeeYoung class.
     * @param name String: The name of the Salary Employee
     * @param address String: The address of the Salary Employee
     * @param ssn String: The social security number of the Salary Employee
     * @param department String: The department the salary Employee works in
     * @param salary double: The monthly salary of the salary Employee
     * @param leave double: The un-paid leave time used by the salary Employee
     */
    public SalariedEmployeeYoung(String name, String address, String ssn, Department department,
                                 double salary, double leave) {
        super(name, address, ssn, department);
        this.salary = salary;
        this.leave = leave;
    } // end default constructor

    /**
     * The getSalary method returns the salary of the Employee
     * Precondition: none
     * Post Condition: Returns the salary of the employee
     * @return (double): The salary of the salary Employee
     */
    public double getSalary() {
        return salary;
    } // end getSalary

    /**
     * The setSalary method sets the salary for the salary Employee
     * Precondition: salary is a number greater than or equal to MIN_SALARY
     * Post Condition: Sets the salary of the Salary Employee
     * @param salary double: The monthly salary of an Employee
     */
    public void setSalary(double salary) throws InputOutOfBoundsException {
        if (salary >= MIN_SALARY) {
            this.salary = salary;
        } else {
            throw new InputOutOfBoundsException("InputOutOfBoundsException: salary must be >= " + MIN_SALARY + ".");
        } // end if else
    } // end setSalary

    /**
     * The getLeave method returns the employees un-paid leave time for the month
     * Precondition: none
     * Post Condition: Returns the employees un-paid leave time for the month
     * @return (double): The employees un-paid leave time for the month
     */
    public double getLeave() {
        return leave;
    } // end getLeave

    /**
     * The setLeave method sets the employees un-paid leave time for the month
     * Precondition: leave is a number >= 0
     * Post Condition: Sets the un-paid leave time used by an employee in a month
     * @param leave double: The un-paid leave time used by an employee in a month
     */
    public void setLeave(double leave) throws InputOutOfBoundsException {
        if (leave >= 0) {
            this.leave = leave;
        } else {
            throw new InputOutOfBoundsException("InputOutOfBoundException: The leave time must be >= 0");
        } // end if else
    } // end setLeave

    /**
     * The yearlySalary method returns the yearly salary of the employee
     * Precondition: none
     * Postcondition: Returns the yearly salary of the Employee
     * @return (double): The yearly salary of the the Employee
     */
    public double yearlySalary() {
        return salary * 12;
    } // end yearlySalary

    @Override
    public double pay() {
        return salary;
    } // end Pay


    @Override
    public String toString() {
        return String.format("%-25s %s %n%-25s %s %n%-25s %.2f %n%-25s %.2f",
                "Name:", getName(), "Department:", getDepartment(), "Monthly Salary:", getSalary(), "Unpaid Leave Time:", getLeave());
    } // end toString
} // end SalariedEmployeeYoung
