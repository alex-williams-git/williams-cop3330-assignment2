/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex29;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test

    public void testInvestment()
    {
        int rate = 4;

        double result = App.calculateInvestmentTime(rate);

        assertEquals(result, 18.0);
    }
}