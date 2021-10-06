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
        ArrayList<String> peopleList = getContestantList();

        String winner = pickWinner(peopleList);

        System.out.println("The winner is... " + winner);
    }

    static ArrayList<String> getContestantList()
    {
        ArrayList<String> contestantList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        String userInput = "";

        do{
            System.out.print("Enter a name: ");
            userInput = scan.nextLine();

            if(userInput.equals(""))
                continue;

            contestantList.add(userInput);

        }while(!userInput.equals(""));

        return contestantList;
    }

    static String pickWinner(ArrayList<String> peopleList)
    {
        int length = peopleList.size();
        int winnerIndex = (int)(length * Math.random());

        return peopleList.get(winnerIndex);
    }
}
