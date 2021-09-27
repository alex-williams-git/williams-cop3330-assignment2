/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex29;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class App {

    public static void main(String[] args)
    {
        System.out.println("It will take " + String.format("%.0f", trapInput()) + " years to double your initial investment.");
    }

    static double trapInput()
    {
        Scanner scan = new Scanner(System.in);

        double rate = 0;
        boolean isNumber;

        do
        {
            System.out.print("Enter an integer value please: ");
            if (scan.hasNextDouble())
            {
                rate = scan.nextDouble();

                if(rate == 0)
                {
                    System.out.println("Sorry you cannot have a rate of 0. Please try again.");
                    isNumber = false;
                    continue;
                }

                isNumber = true;
            }else
            {
                System.out.println("Sorry that is not an integer. Please try again.");
                isNumber = false;
                scan.next();
            }
        }while(!isNumber);

        double years = Math.ceil(72 / rate);

        return years;
    }
}
