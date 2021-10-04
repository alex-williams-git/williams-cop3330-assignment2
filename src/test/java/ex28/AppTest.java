/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex28;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test

    public void testSum()
    {
        int array[] = {1, 2, 3, 4, 5};

        int result = App.sumNumbers(array);

        assertEquals(result, 15);
    }

}