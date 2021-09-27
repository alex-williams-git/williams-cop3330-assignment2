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

        magicGame();
    }

    static void magicGame()
    {
        String[] responses = {"Yes", "No", "Maybe", "Ask again later."};
        int random_num = (int)(4 * Math.random());

        System.out.println(responses[random_num]);
    }
}
