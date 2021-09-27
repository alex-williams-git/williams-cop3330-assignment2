/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex39;

public class Employee {

    private String first;
    private String last;
    private String position;
    private String sepDate;

    public Employee(String first, String last, String position)
    {
        this.first = first;
        this.last = last;
        this.position = position;
        this.sepDate = " ";
    }

     public Employee(String first, String last, String position, String sepDate)
    {
        this.first = first;
        this.last = last;
        this.position = position;
        this.sepDate = sepDate;
    }

    public String getFirst() {
        return this.first;
    }

    public String getLast(){
        return this.last;
    }

    public String getName() {
        return this.first + " " + this.last;
    }

    public String getPosition(){
        return this.position;
    }

    public String getSepDate(){
        return this.sepDate;
    }
}
