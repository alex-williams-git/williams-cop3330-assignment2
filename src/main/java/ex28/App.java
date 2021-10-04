/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex28;
import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        int[] inputArray = scanInput();
        System.out.printf("The sum of the numbers is: %d", sumNumbers(inputArray));
    }

    static int[] scanInput()
    {
        Scanner scan = new Scanner(System.in);

        int[] ret = new int[5];

        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            ret[i] = scan.nextInt();
        }

        return ret;
    }

    static int sumNumbers(int[] numberArray)
    {
        int sum = 0;

        for (int i = 0; i < 5; i++)
        {
            sum += numberArray[i];
        }

        return sum;
    }
}
