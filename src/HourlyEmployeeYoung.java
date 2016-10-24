import java.util.InputMismatchException;

/**
 * CSC 1600 Data Structures
 * CH2 Programming Lab
 *
 * The HourlyEmployeeYoung class represents an employee who gets paid by the hour.
 * @author Brandon Young
 */
// File Name: HourlyEmployeeYoung.java
public class HourlyEmployeeYoung extends EmployeeYoung {

    // The hourly wage of the HourlyEmployee
    private double hourlyWage;
    // The number of hours worked by the HourlyEmployee
    private double hoursWorked;
    // The Current Federal Minimum Wage
    private final double MIN_WAGE = 7.25;
    // The number of hours in a week
    private final double HOURS_IN_WEEK = 168;
    // The overtime rate
    private final double OVERTIME_RATE = 1.5;
    // The amount of hours before overtime is given
    private final double OVERTIME_HOURS = 40;

    /**
     * The Constructor for the HourlyEmployeeYoung class.
     * Precondition: none
     * Post Condition: creates an Hourly Employee Object
     * @param name String: The name of the Hourly Employee
     * @param address String: The address of the Hourly Employee
     * @param ssn String: The social security number of the Hourly Employee
     * @param department String: The department the Hourly Employee works in
     */
    public HourlyEmployeeYoung(String name, String address, String ssn, Department department,
                               double hoursWorked, double hourlyWage) {
        super(name, address, ssn, department);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    } // end default constructor

    /**
     * The getHourlyWage method returns the hourly wage for the Hourly Employee
     * Precondition: none
     * Post Condition: Returns the hourly wage of the employee
     * @return (double): The hourly Wage of the Employee
     */
    public double getHourlyWage() {
        return hourlyWage;
    } // end getHourlyWage

    /**
     * The setHourlyWage method sets the hourly wage for the Employee and throws an error if the input is not a number
     * or less than the current minimum federal wage.
     * Precondition: hourlyWage is an Integer > MIN_WAGE
     * Post Condition: Sets the Employee hourly wage
     * @param hourlyWage double: The hourly wage of the Employee
     */
    public void setHourlyWage(double hourlyWage) throws InputMismatchException, InputOutOfBoundsException {
        if (hourlyWage >= MIN_WAGE) {
            this.hourlyWage = hourlyWage;
        } else if (hourlyWage < MIN_WAGE) {
            throw new InputOutOfBoundsException("InputOutOfBoundsException: hourlyWage must be greater than " +
                    MIN_WAGE + ".");
        } else {
            throw new InputMismatchException("InputMismatchException: hourlyWage must be in the form of a number.");
        } // end if else
    } // end setHourlyWage

    /**
     * The getHoursWorked returns the hours worked by the Employee
     * Precondition: none
     * Post Condition: Returns the hours worked for the week.
     * @return (double): The amount of hours worked
     */
    public double getHoursWorked() {
        return hoursWorked;
    } // end getHoursWorked

    /**
     * The setHoursWorked method sets the hours worked for the hourly Employee
     * Precondition: hoursWorked is a number >= 1 && hoursWorked < HOURS_IN_WEEK
     * @param hoursWorked
     */
    public void setHoursWorked(double hoursWorked) throws InputOutOfBoundsException {
        if (hoursWorked >= 0 && hoursWorked < HOURS_IN_WEEK) {
            this.hoursWorked = hoursWorked;
        } else if (hoursWorked < 0) {
            throw new InputOutOfBoundsException("InputOutOfBoundsException: hoursWorked must be greater than 0.");
        } else if (hoursWorked > HOURS_IN_WEEK) {
            throw new InputOutOfBoundsException("InputOutOfBoundsException: hoursWorked must be less than " +
                    HOURS_IN_WEEK + ".");
        } else {
            throw new InputMismatchException("InputMismatchException: Input expected a number");
        } // end if else
    } // end setHoursWorked

    @Override
    public double pay() {
        if (hoursWorked <= OVERTIME_HOURS) {
            return hoursWorked * hourlyWage;
        } else {
            // return pay with overtime included
            return ((hoursWorked - OVERTIME_HOURS) * (hourlyWage * OVERTIME_RATE)) + (OVERTIME_HOURS * hourlyWage);
        } // end if else
    } // end pay

    @Override
    public String toString() {
        return String.format("%-25s %s %n%-25s %s %n%-25s %.2f",
                "Name:", getName(), "Department:", getDepartment(), "Weekly Pay:", pay());
    } // end toString

} // end HourlyEmployeeYoung
