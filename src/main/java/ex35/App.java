/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex35;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class App {

    public static void main(String[] args)
    {
        ArrayList<String> peopleList = new ArrayList<String>();

        pickWinner(peopleList);
    }

    static void pickWinner(ArrayList<String> peopleList)
    {
        Scanner scan = new Scanner(System.in);
        String userInput = "";

        do{
            System.out.print("Enter a name: ");
            userInput = scan.nextLine();

            if(userInput.equals(""))
                continue;

            peopleList.add(userInput);

        }while(!userInput.equals(""));

        int length = peopleList.size();
        int winnerIndex = (int)(length * Math.random());

        System.out.println("The winner is... " + peopleList.get(winnerIndex));
    }
}
