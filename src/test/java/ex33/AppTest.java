/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex33;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test

    public void test8Ball()
    {
        String[] responses = {"Yes", "No", "Maybe", "Ask again later."};
        int random_num = App.generateRandomNum();

        String expected = responses[random_num];
        String result = App.magicGame(random_num);

        assertEquals(expected, result);
    }
}