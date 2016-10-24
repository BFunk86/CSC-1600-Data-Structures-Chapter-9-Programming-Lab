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

    /**
     * The Constructor for the HourlyEmployeeYoung class.
     * Precondition:
     * Postcondition:
     * @param name String: The name of the Hourly Employee
     * @param address String: The address of the Hourly Employee
     * @param ssn String: The social security number of the Hourly Employee
     * @param department String: The department the Hourly Employee works in
     */
    public HourlyEmployeeYoung(String name, String address, String ssn, String department) {
        super(name, address, ssn, department);
    } // end default constructor

    /**
     * The getHourlyWage method returns the hourly wage for the Hourly Employee
     * Precondition:
     * Postcondition
     * @return (double): The hourly Wage of the Employee
     */
    public double getHourlyWage() {
        return hourlyWage;
    }

    /**
     * The setHourlyWage method sets the hourly wage for the Employee
     * Precondition: hourlyWage is an Integer > MIN_WAGE
     * Post Condition: Sets the Employee hourly wage
     * @param hourlyWage double: The hourly wage of the Employee
     */
    public void setHourlyWage(double hourlyWage) throws InputMismatchException{
        if (hourlyWage >= MIN_WAGE) {
            this.hourlyWage = hourlyWage;
        } else {
            throw new InputMismatchException("InputMismatchException: hourlyWage must be an integer greater than "
                    + MIN_WAGE + ".");
        } // end if else
    } // end setHourlyWage

    /**
     *
     * @return
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     *
     * @param hoursWorked
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double pay() {

    } // end pay

} // end HourlyEmployeeYoung
