/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex37;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.lang.Math;
import java.util.Collections;

public class App {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the minimum length? ");
        int length = scan.nextInt();

        System.out.print("How many special characters? ");
        int numChars = scan.nextInt();

        System.out.print("How many numbers? ");
        int numDigits = scan.nextInt();

        ArrayList <Character> pass = generatePass(length, numChars, numDigits);

        System.out.print("Your password is ");

        for(int i = 0; i < pass.size(); i++)
            System.out.print(pass.get(i));
    }

    static ArrayList<Character> generatePass(int length, int numChars, int numDigits)
    {
        ArrayList<Character> charSet = new ArrayList<Character>(
                Arrays.asList('+', '-', ')', '(', '*', '&', '^', '%', '$', '#', '@', '!')
        );

        Random r = new Random();

        ArrayList<Character> charList = new ArrayList<Character>();

        for(int i = 0; i < numChars; i++)
        {
            int index = (int)(12 * Math.random());
            charList.add(charSet.get(index));
        }

        for(int i = 0; i < numDigits; i++)
        {
            int randInt = 48 + (int)(10 * Math.random());
            char randIntToChar = (char)randInt;
            charList.add(randIntToChar);
        }

        for(int i = 0; i < numChars + numDigits + 1; i++)
        {
            char randChar = (char)(r.nextInt(26) + 'a');
            charList.add(randChar);
        }

        Collections.shuffle(charList);

        return charList;
    }
}
