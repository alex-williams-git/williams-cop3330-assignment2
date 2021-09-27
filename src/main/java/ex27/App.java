/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex27;
import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String first = scan.nextLine();

        System.out.print("Enter the last name: ");
        String last = scan.nextLine();;

        System.out.print("Enter the ZIP code: ");
        String zipcode = scan.nextLine();

        System.out.print("Enter the employee ID: ");
        String ID = scan.nextLine();

        validateInput(first, last, zipcode, ID);
    }

    static void validateInput(String first, String last, String zipcode, String ID)
    {
        if(!validateNameFilled(first))
            System.out.println("The first name must be filled.");

        else if(!validateNameLength(first))
            System.out.println("The first name must be at least 2 characters long.");

        else if(!validateNameFilled(last))
            System.out.println("The last name must be filled.");

        else if(!validateNameLength(first))
            System.out.println("The last name must be at least 2 characters long.");

        else if(!validateZip(zipcode))
            System.out.println("The zipcode must be a 5 digit number.");

        else if(!validateID(ID))
            System.out.println("The ID must be in the format of AA-1234");

        else
            System.out.println("There were no errors found.");
    }

    static Boolean validateNameLength(String name)
    {
        int length = name.length();

        if(length < 2)
            return false;

        return true;
    }

    static Boolean validateNameFilled(String name)
    {
        if(name.isEmpty())
            return false;

        return true;
    }

    static Boolean validateID(String ID)
    {
        int length = ID.length();

        if(length != 7)
            return false;

        char[] ID_array = ID.toCharArray();

        if(!Character.isAlphabetic(ID_array[0]))
            return false;

        if(!Character.isAlphabetic(ID_array[1]))
            return false;

        if(ID_array[2] != '-')
            return false;

        for(int i = 3; i < length; i++)
        {
            if(!Character.isDigit(ID_array[i])) {
                return false;
            }
        }

        return true;
    }

    static Boolean validateZip(String zipcode)
    {
        if(zipcode.isEmpty())
            return false;

        for(int i : zipcode.toCharArray())
        {
            if(Character.isDigit(i))
                return true;
            else
                return false;
        }

        return true;
    }

}
