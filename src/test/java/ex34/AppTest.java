/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex34;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test

    public void testEmployeeRemoval()
    {
        String[] employeeList = {"Joe Johnson", "Amanda Smith", "Jane Doe", "Will Smith", "Matthew McConaughey"};
        String employeeToRemove = "Matthew McConaughey";

        String[] result = App.removeEmployee(employeeList, employeeToRemove);
        String[] expected = {"Joe Johnson", "Amanda Smith", "Jane Doe", "Will Smith"};

        for(int i = 0; i < 4; i++)
        {
            assertEquals(result[i], expected[i]);
        }
    }
}