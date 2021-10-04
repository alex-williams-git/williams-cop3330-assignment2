/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex24;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test

    public void testAnagram()
    {
        App application = new App();
        String string1 = "note";
        String string2 = "tone";

        char[] string1Array = string1.toCharArray();
        char[] string2Array = string2.toCharArray();

        Boolean result = application.isAnagram(string1Array, string2Array);
        Boolean expected = true;

        assertEquals(result, expected);
    }

}