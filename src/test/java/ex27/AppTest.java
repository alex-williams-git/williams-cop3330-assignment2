/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex27;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test

    public void testValidation()
    {
        String first = "John";
        String last = "Johnson";
        String zip = "55555";
        String ID = "TK-431";

        App application = new App();

        int result = application.validateInput(first, last, zip, ID);

        assertEquals(result, 1);
    }
}