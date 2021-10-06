/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex39;
import java.util.*;
import java.util.List;

public class App {

    public static void main(String[] args)
    {
        Employee employee1 = new Employee("John", "Johnson", "Manager", "2016-12-31");
        Employee employee2 = new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05");
        Employee employee3 = new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19");
        Employee employee4 = new Employee("Jake", "Jacobson", "Programmer");
        Employee employee5 = new Employee("Jacquelyn", "Jackson", "DBA");
        Employee employee6 = new Employee("Sally", "Webber", "Web Developer", "2015-12-18");

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);

        List<Employee> updatedList = sortEmployees(employeeList);
    }

    public static List<Employee> sortEmployees(List<Employee> employeeList)
    {
        for(int i = 0; i < employeeList.size(); i++)
        {
            String temp = employeeList.get(i).getLast();

            for(int j = 0; j < employeeList.size(); j++)
            {
                if(i == j)
                    continue;

                String temp2 = employeeList.get(j).getLast();

                if(temp.compareTo(temp2) < 0)
                {
                    Employee tempEmployee = employeeList.get(i);
                    Employee tempEmployee2 = employeeList.get(j);

                    employeeList.set(i, tempEmployee2);
                    employeeList.set(j, tempEmployee);
                }
            }
        }

        System.out.printf("%-20s | %-20s | %-15s\n", "Name", "Position", "Separation Date");
        System.out.println("---------------------|----------------------|------------------");

        for(int i = 0; i < employeeList.size(); i++)
        {
            System.out.printf("%-20s | %-20s | %-15s", employeeList.get(i).getName(), employeeList.get(i).getPosition(), employeeList.get(i).getSepDate());
            System.out.println();
        }

        return employeeList;
    }
}
