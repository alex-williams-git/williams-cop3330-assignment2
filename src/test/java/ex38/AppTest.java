/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex38;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test

    public void testFilter()
    {
        String testString = "1 2 3 4 5 6 7 8";

        String result = App.filterEvenNumbers(testString);
        String expected = "2 4 6 8";

        char[] resultArray = result.toCharArray();
        char[] expectedArray = expected.toCharArray();

        int length = resultArray.length;

        for(int i = 0; i < length - 1; i++)
        {
            assertEquals(resultArray[i], expectedArray[i]);
        }
    }
}