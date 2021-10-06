/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex40;
import java.util.*;
import java.util.List;
import ex39.Employee;
import java.util.Scanner;

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

        String searchResult = getSearch();

        List<Employee> sortedList = getSearchResults(employeeList, searchResult);
    }

    public static String getSearch()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a search string: ");
        String search = scan.nextLine();
        System.out.println();

        return search;
    }

    public static List<Employee> getSearchResults(List<Employee> employeeList, String search)
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

        List<Employee> searchResults = new ArrayList<>();

        for(int i = 0; i < employeeList.size(); i++)
        {
            String temp = employeeList.get(i).getLast();
            String temp2 = employeeList.get(i).getFirst();

            if(temp.contains(search) || temp2.contains(search))
            {
                searchResults.add(employeeList.get(i));
            }
        }

        System.out.println("Results: ");
        System.out.println();

        System.out.printf("%-20s | %-20s | %-15s\n", "Name", "Position", "Separation Date");
        System.out.println("---------------------|----------------------|------------------");

        for(int i = 0; i < searchResults.size(); i++)
        {
            System.out.printf("%-20s | %-20s | %-15s", searchResults.get(i).getName(), searchResults.get(i).getPosition(), searchResults.get(i).getSepDate());
            System.out.println();
        }

        return searchResults;
    }
}
