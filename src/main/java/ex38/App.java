/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex38;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String userIn = scan.nextLine();

        System.out.printf("The even numbers are: %s \n", filterEvenNumbers(userIn));
    }

    static String filterEvenNumbers(String numberList)
    {
        ArrayList<Integer> numberListArray = new ArrayList<Integer>();
        char[] numberListArrayChar = numberList.toCharArray();

        String ret = "";

        for(int i = 0; i < numberListArrayChar.length; i++)
        {
            if(Character.isDigit(numberListArrayChar[i]))
            {
                int addedDigit = numberListArrayChar[i] - '0';
                numberListArray.add(addedDigit);
            }
        }

        for(int i = 0; i < numberListArray.size(); i++)
        {
            if(numberListArray.get(i) % 2 == 1)
            {
                numberListArray.remove(i);
            }
        }

        for(int i : numberListArray)
        {
            ret += i + " ";
        }

        return ret;
    }
}
