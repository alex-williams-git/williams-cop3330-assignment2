/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex24;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class App {

    public Boolean isAnagram;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first_word = scan.nextLine();

        System.out.print("Enter the second string: ");
        String second_word = scan.nextLine();

        char[] first_word_array = first_word.toCharArray();
        char[] second_word_array = second_word.toCharArray();

        if(isAnagram(first_word_array, second_word_array))
            System.out.println(first_word + " and " + second_word + " are anagrams.");
        else
            System.out.println(first_word + " and " + second_word + " are not anagrams.");
    }

    static Boolean isAnagram (char[] first_string, char[] second_string)
    {
        int length1 = first_string.length;
        int length2 = second_string.length;

        if(length1 != length2)
            return false;

        Arrays.sort(first_string);
        Arrays.sort(second_string);

        for(int i = 0; i < length2; i++)
        {
            if(first_string[i] != second_string[i])
            {
                return false;
            }
        }

        return true;
    }
}
