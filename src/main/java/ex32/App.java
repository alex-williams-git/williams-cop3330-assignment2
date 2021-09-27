/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex32;
import java.util.Scanner;
import java.lang.Math;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userIn = "";

        do{
            guessingGame();
            System.out.print("Do you want to play again (y/n): ");
            userIn = scan.nextLine();
        }while(userIn.equals("y") || userIn.equals(" "));
    }

    static void guessingGame() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        int difficulty = scan.nextInt();

        int answer = 0;

        if (difficulty == 1) {
            answer = 1 + (int) (10 * Math.random());
        }

        if (difficulty == 2) {
            answer = 1 + (int) (100 * Math.random());
        }

        if (difficulty == 3) {
            answer = 1 + (int) (1000 * Math.random());
        }

        System.out.print("I have my number. What's your guess? ");
        int guess = scan.nextInt();

        if (guess == answer) {
            System.out.println("Wow you got it in one guess!");
            return;
        }

        if (guess < answer)
            System.out.print("Too low guess again.");

        if (guess > answer) {
            System.out.println("Too high guess again.");
        }

        for (int i = 1; i < 10; i++) {
            guess = scan.nextInt();

            if (guess == answer) {
                System.out.printf("Wow you got it in %d guess!", i);
                return;
            }

            if (guess < answer && i != 9)
                System.out.print("Too low guess again.");

            if (guess > answer && i != 9)
                System.out.println("Too high guess again.");
        }

        System.out.println("You ran out of guesses.");
    }
}

