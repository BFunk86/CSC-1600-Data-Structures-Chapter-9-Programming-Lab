/**
 * CSC 1600 Data Structures
 * CH2 Programming Lab
 *
 * Project Description:
 *
 * Design and implement the following classes and write a test program:
 *
 * An abstract class Employee that represents a generic employee that has fields for name, address, ssn, and department.
 * Include methods to retrieve information about an employee and save it as EmployeeYourLastName.java.
 *
 * A subclass of Employee called HourlyEmployee that describes an employee who gets paid by the hour. Include a public
 * method called pay() that returns the pay of the employee for that week, and any other relevant methods to manage
 * data fields such as hourly wage and number of hours worked and save it as HourlyEmployeeYourLastName.java.
 *
 * A subclass of Employee called SalariedEmployee that describes an employee who gets paid a fixed salary every month.
 * Include a public method called pay() that returns the pay of the employee for that month, and any other relevant
 * methods to manage data fields such as yearly salary and any unpaid leave taken that month and save it as
 * SalariedEmployeeYourLastName.java.
 *
 * Write a test program to test thoroughly the classes you have designed and save it as DriverPayYourLastName.java.
 *
 * @author Brandon Young
 */
// File Name: DriverPayYoung.java
public class DriverPayYoung {
    public static void main(String[] args) {

        SalariedEmployeeYoung ceo = new SalariedEmployeeYoung("Bob White", "107 Grand Street", "123456789", "Bussiness", 6000.00, 0);

        HourlyEmployeeYoung janitor = new HourlyEmployeeYoung("Steve Michaels", "307 Riverfront Drive", "134568785", "Maintenance", 42, 12);

        System.out.println(ceo);
        System.out.println(janitor);

    } // end main
}
