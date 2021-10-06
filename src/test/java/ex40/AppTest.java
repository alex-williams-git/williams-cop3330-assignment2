package ex40;

import ex39.Employee;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test

    public void testEmployeeSearch()
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

        String search = "Ja";

        List<Employee> sortedList = App.getSearchResults(employeeList, search);

        assertEquals("Jacquelyn", sortedList.get(0).getFirst());
        assertEquals("Jake", sortedList.get(1).getFirst());
    }
}