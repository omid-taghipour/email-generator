/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailgenerator;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author omid
 */
public class EmailGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.show();
        System.out.println("What is the name of the Company? ");
        Scanner sc = new Scanner(System.in);
        String comapny_name = sc.next().toLowerCase();

        //Creating a new Employee
        Employee employee = add_employee();
        Email email = add_email(comapny_name, employee);
        seprator_stars();

        System.out.println("Congradulations! The Employee and Email has been added SUCCESSFULLY."
                + "\nYou can view the information below:");

        show_employee(employee);
        show_email(email);

        seprator_stars();
        System.out.println("Now it is the time to set your own email password. ");
        System.out.println(">> Enter the new Password: ");
        email.setPassword(sc.next());
        System.out.println("Password has been updated SUCCESSFULLY");
        System.out.println("Do you want to view information again? ");
        String answer = sc.next();
        if (answer.equalsIgnoreCase("yes")) {
            show_email(email);
        } else {
            return;
        }
    }

    public static void show_employee(Employee emp) {
        System.out.println(">> Employee information: " + emp);
    }

    public static void show_email(Email mail) {
        System.out.println(">> " + mail);
    }

    public static Email add_email(String company_name, Employee employee) {
        Scanner sc = new Scanner(System.in);
        seprator_stars();
        System.out.println("Enter the alternative email: ");
        String alt_mail = sc.next().toLowerCase();
        seprator_stars();
        System.out.println("Enter the mail capacity: ");
        Integer mail_capacity = sc.nextInt();

        Email email = new Email(company_name, alt_mail, employee, mail_capacity);

        return email;
    }

    public static Employee add_employee() {
        Employee employee;

        System.out.println("Adding a new Employee\n");

        //Getting the Employee information
        System.out.println("Entering Employee first name: ");
        Scanner scanner = new Scanner(System.in);
        String f_name = scanner.next().toLowerCase();
        System.out.println("Entering Employee last name: ");
        String l_name = scanner.next().toLowerCase();

        seprator_stars();
        //Getting employee Date of Birth
        System.out.println("Employee Date of birth\n");
        System.out.println("Enter the Day: ");
        Integer dob_day = scanner.nextInt();
        System.out.println("Enter the Month: ");
        Integer dob_month = scanner.nextInt();
        System.out.println("Enter the Year: ");
        Integer dob_year = scanner.nextInt();

        seprator_stars();

        //Getting the Employee Department information
        System.out.println("Which department does the employee work at? ");
        for (Departments department : Departments.values()) {
            System.out.println(department.ordinal() + 1 + ". " + department.toString().toUpperCase());
        }
        Integer department_id = scanner.nextInt() - 1;

        //Creating Employee Object
        employee = new Employee(f_name, l_name, LocalDate.of(dob_year, Month.of(dob_month), dob_day), Departments.values()[department_id]);

        return employee;

    }

    private static String seprator_stars() {
        return "\n\n***********************************************";
    }
}
