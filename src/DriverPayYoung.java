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

        // An array of employees
        EmployeeYoung[] staff = new EmployeeYoung[5];

        staff[0] = new SalariedEmployeeYoung("Yoda", "107 Dagobah Street", "123456789", Department.BUSSINESS, 6000.00, 8);
        staff[1] = new SalariedEmployeeYoung("Obi-Wan Kenobi", "321 Tatooine Rd.", "256875859", Department.ACCOUNTING, 3500.00, 12);
        staff[2] = new SalariedEmployeeYoung("Wicket Warrick", "Endoor Street", "789456123", Department.IT, 4000.00, 4);
        staff[3] = new HourlyEmployeeYoung("Luke Skywalker", "556 Jedi Lane", "456987125", Department.SALES, 35, 15);
        staff[4] = new HourlyEmployeeYoung("Princess Leia", "307 Alderaan HWY", "134568785", Department.MAINTENANCE, 42, 13);

        // print current employee information
        for (int index = 0; index < staff.length; index++) {
            System.out.println(staff[index] + "\n");
        } // end for loop

        // Give everyone a 15% raise
        for (EmployeeYoung employee: staff) {
            if (employee instanceof SalariedEmployeeYoung) {
                ((SalariedEmployeeYoung) employee).setSalary(((SalariedEmployeeYoung) employee).getSalary() * 1.15);
            } else if (employee instanceof HourlyEmployeeYoung){
                ((HourlyEmployeeYoung) employee).setHourlyWage(((HourlyEmployeeYoung) employee).getHourlyWage() * 1.15);
            } // end if else
        } // end for loop

        // print new employee information after raise
        for (int index = 0; index < staff.length; index++) {
            System.out.println(staff[index] + "\n");
        } // end for loop

    } // end main
} // end DriverPayYoung
/*
    SAMPLE OUTPUT:

Name:                     Yoda
Department:               BUSSINESS
Monthly Salary:           6000.00
Unpaid Leave Time:        8.00

Name:                     Obi-Wan Kenobi
Department:               ACCOUNTING
Monthly Salary:           3500.00
Unpaid Leave Time:        12.00

Name:                     Wicket Warrick
Department:               IT
Monthly Salary:           4000.00
Unpaid Leave Time:        4.00

Name:                     Luke Skywalker
Department:               SALES
Weekly Pay:               525.00

Name:                     Princess Leia
Department:               MAINTENANCE
Weekly Pay:               559.00

Name:                     Yoda
Department:               BUSSINESS
Monthly Salary:           6900.00
Unpaid Leave Time:        8.00

Name:                     Obi-Wan Kenobi
Department:               ACCOUNTING
Monthly Salary:           4025.00
Unpaid Leave Time:        12.00

Name:                     Wicket Warrick
Department:               IT
Monthly Salary:           4600.00
Unpaid Leave Time:        4.00

Name:                     Luke Skywalker
Department:               SALES
Weekly Pay:               603.75

Name:                     Princess Leia
Department:               MAINTENANCE
Weekly Pay:               642.85


Process finished with exit code 0
 */
