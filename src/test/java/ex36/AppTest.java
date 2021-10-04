/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex36;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test

    public void testStatsCalculator()
    {
        ArrayList<Double> testArray = new ArrayList<Double>();

        testArray.add(100.0);
        testArray.add(200.0);
        testArray.add(1000.0);
        testArray.add(300.0);

        int length = testArray.size();
        statsCalculator statsCalculator1 = new statsCalculator(length, testArray);

        double result1 = statsCalculator1.average();
        double result2 = statsCalculator1.min();
        double result3 = statsCalculator1.max();
        double result4 = statsCalculator1.std();

        assertEquals(result1, 400.0);
        assertEquals(result2, 100.0);
        assertEquals(result3, 1000.0);
        assertEquals(result4, 353.55);
    }
}