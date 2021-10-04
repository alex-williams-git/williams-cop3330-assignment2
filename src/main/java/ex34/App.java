/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex34;
import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        String[] employeeList = {"Joe Johnson", "Amanda Smith", "Jane Doe", "Will Smith", "Matthew McConaughey"};

        String employeeToRemove = findEmployeeToRemove(employeeList);

        removeEmployee(employeeList, employeeToRemove);
    }

    static String findEmployeeToRemove(String[] employees)
    {
        Scanner scan = new Scanner(System.in);
        int num_employees = employees.length;

        System.out.printf("There are %d employees: \n", num_employees);

        for(int i = 0; i < num_employees; i++)
        {
            System.out.println(employees[i]);
        }
        System.out.println();

        System.out.print("Enter an employee name to remove: ");
        String employeeToRemove = scan.nextLine();
        System.out.println();

        return employeeToRemove;
    }

    static String[] removeEmployee(String[] employees, String employeeToRemove)
    {
        int num_employees = employees.length;
        String[] newEmployees = new String[num_employees - 1];

        int removeIndex = 0;

        for(int i = 0; i < num_employees; i++)
        {
            if(employees[i].equals(employeeToRemove))
                removeIndex = i;
        }

        for(int i = 0, k = 0; i < num_employees; i++)
        {
            if(i == removeIndex)
                continue;

            newEmployees[k++] = employees[i];
        }

        System.out.printf("There are %d employees: \n", num_employees - 1);

        for(int i = 0; i < num_employees - 1; i++)
        {
            System.out.println(newEmployees[i]);
        }

        return newEmployees;
    }
}
