/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex33;
import java.util.Scanner;
import java.lang.Math;

public class App {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your question?");
        System.out.print("> ");
        String userInput = scan.nextLine();
        System.out.println();

        int randNum = generateRandomNum();

        magicGame(randNum);
    }

    static int generateRandomNum()
    {
        int random_num = (int)(4 * Math.random());

        return random_num;
    }

    static String magicGame(int randNum)
    {
        String[] responses = {"Yes", "No", "Maybe", "Ask again later."};

        System.out.println(responses[randNum]);

        String ret = responses[randNum];

        return ret;
    }
}
