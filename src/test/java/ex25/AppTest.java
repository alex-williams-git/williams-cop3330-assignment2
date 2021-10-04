/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex25;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test

    public void testPasswordValidator()
    {
        App application = new App();
        String string1 = "12345";
        String string2 = "abcdef";
        String string3 = "abc123xyz";
        String string4 = "1337h@xor!";

        int result1 = application.passwordValidator(string1);
        int result2 = application.passwordValidator(string2);
        int result3 = application.passwordValidator(string3);
        int result4 = application.passwordValidator(string4);

        assertEquals(result1, 3);
        assertEquals(result2, 2);
        assertEquals(result3, 1);
        assertEquals(result4, 0);
    }
}