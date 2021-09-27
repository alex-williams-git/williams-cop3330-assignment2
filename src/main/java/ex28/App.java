/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex28;
import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        System.out.printf("The sum of the numbers is: %d", sumNumbers());
    }

    static int sumNumbers()
    {
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        int temp_sum = 0;
        for (int i = 1; i < 6; i++)
        {
            System.out.print("Enter a number: ");
            temp_sum = scan.nextInt();
            sum += temp_sum;
        }

        return sum;
    }
}
