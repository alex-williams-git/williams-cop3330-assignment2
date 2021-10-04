/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex31;
import java.util.Scanner;
import java.lang.Math;

public class App {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your resting heart rate: ");
        int resting_HR = scan.nextInt();

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        printTargetHR(resting_HR, age);
    }

    static int calculateTargetHR(int resting_HR, int age, double intensity)
    {
        int target_HR = (int)Math.round((((220 - age) - resting_HR) * intensity) + resting_HR);

        return target_HR;
    }

    static void printTargetHR(int resting_HR, int age)
    {
        System.out.printf("%-15s | %-10s", "Intensity", "Rate");
        System.out.println();
        System.out.println("----------------|--------");

        for(double i = 0.55; i < 1.0; i += 0.05)
        {
            int target_HR = calculateTargetHR(resting_HR, age, i);
            String display_intensity = String.format("%.0f", i * 100);

            System.out.printf("%s%%             | %d bpm", display_intensity, target_HR);
            System.out.println();
        }
    }
}
