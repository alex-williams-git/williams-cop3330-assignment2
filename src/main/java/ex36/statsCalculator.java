/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex36;
import java.util.ArrayList;
import java.lang.Math;

public class statsCalculator {

    private int length;
    private ArrayList<Double> numberList;

    public statsCalculator()
    {
        length = 0;
        numberList.add(0.0);
    }

    public statsCalculator(int length, ArrayList<Double> numberList)
    {
        this.length = length;
        this.numberList = numberList;
    }

    public double average()
    {
        double totalSum = 0.0;

        for(int i = 0; i < length; i++)
        {
            totalSum += numberList.get(i);
        }

        return totalSum / length;
    }

    public double min()
    {
        double min = Double.MAX_VALUE;

        for(int i = 0; i < length; i++)
        {
            if(numberList.get(i) < min)
                min = numberList.get(i);
        }

        return min;
    }

    public double max()
    {
        double max = 0.0;

        for(int i = 0; i < length; i++)
        {
            if(numberList.get(i) > max)
                max = numberList.get(i);
        }

        return max;
    }

    public double std()
    {
        double mean = average();
        double sumOfPoints = 0.0;

        for(int i = 0; i < length; i++)
        {
            sumOfPoints += Math.pow(numberList.get(i) - mean, 2);
        }

        double variance = sumOfPoints / length;
        double std = Math.sqrt(variance);
        double final_std = Math.round(std * 100.0) / 100.0;

        return final_std;
    }
}
