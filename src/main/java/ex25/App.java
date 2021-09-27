/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex25;
import java.util.Scanner;
import java.util.*;

public class App {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scan.nextLine();

        if(passwordValidator(password) == 0)
            System.out.println("The password " + password + " is a very strong password");
        if(passwordValidator(password) == 1)
            System.out.println("The password " + password + " is a strong password");
        if(passwordValidator(password) == 2)
            System.out.println("The password " + password + " is a weak password");
        if(passwordValidator(password) == 3)
            System.out.println("The password " + password + " is a very weak password");
    }

    static int passwordValidator(String input)
    {
        int length = input.length();

        boolean containsLetter = false;
        boolean containsChars = false;
        boolean containsInt = false;

        Set<Character> charSet = new HashSet<Character>(
                Arrays.asList('+', '-', ')', '(', '*', '&', '^', '%', '$', '#', '@', '!')
        );

        for(char i : input.toCharArray())
        {
            if(Character.isAlphabetic(i))
                containsLetter = true;
            if(charSet.contains(i))
                containsChars = true;
            if(Character.isDigit(i))
                containsInt = true;
        }

        if(containsLetter && containsInt && containsChars && length >= 8)
            return 0;
        else if(containsLetter && containsInt && length >= 8)
            return 1;
        else if(containsLetter && !containsInt)
            return 2;
        else
            return 3;
    }
}
