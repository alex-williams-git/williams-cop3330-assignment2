/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex36;
import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> numberList = new ArrayList<Double>();

        String userInput = "";
        double doubleInput = 0.0;

        do{
            System.out.print("Enter a number: ");

            if(scan.hasNextDouble()) {
                doubleInput = scan.nextDouble();
                numberList.add(doubleInput);
            }

            if(scan.hasNextLine())
            {
                userInput = scan.nextLine();
            }

        }while(!userInput.equals("done"));

        int length = numberList.size();

        statsCalculator statsCalculator1 = new statsCalculator(length, numberList);

        System.out.println("The average is " + statsCalculator1.average());
        System.out.println("The minimum is " + statsCalculator1.min());
        System.out.println("The maximum is " + statsCalculator1.max());
        System.out.println("The standard deviation is " + statsCalculator1.std());
    }
}
