/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex31;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test

    public void testTargetHeartRate()
    {
        int restingHR = 65;
        int age = 22;
        double intensity1 = .55;
        double intensity2 = .95;

        int result1 = App.calculateTargetHR(restingHR, age, intensity1);
        int result2 = App.calculateTargetHR(restingHR, age, intensity2);

        assertEquals(result1, 138);
        assertEquals(result2, 191);
    }
}