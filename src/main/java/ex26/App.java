/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex26;
import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your balance? ");
        double balance = scan.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        double APR = scan.nextDouble();

        System.out.print("What is the monthly payment you are able to make? ");
        double monthly_payment = scan.nextDouble();

        PaymentCalculator paymentCalculator1 = new PaymentCalculator(APR, balance, monthly_payment);
        System.out.println("It will take you " + String.format("%.0f",paymentCalculator1.calculateMonthsUntilPaidOff()) + " months to pay off.");

    }

}
