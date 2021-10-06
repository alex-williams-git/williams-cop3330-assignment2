/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex32;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test

    public void testGameDifficulty()
    {
        int difficulty1 = 1;
        int difficulty2 = 2;
        int difficulty3 = 3;
        int answer1 = App.giveRandomNumber(difficulty1);
        int answer2 = App.giveRandomNumber(difficulty2);
        int answer3 = App.giveRandomNumber(difficulty3);

        int Boolean1 = 0;
        int Boolean2 = 0;
        int Boolean3 = 0;

        if(answer1 <= 10)
            Boolean1 = 1;

        if(answer2 <= 100)
            Boolean2 = 1;

        if(answer3 <= 1000)
            Boolean3 = 1;

        assertEquals(Boolean1, 1);
        assertEquals(Boolean2, 1);
        assertEquals(Boolean3, 1);
    }

}