package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Michael Kisida
 */


public class Month
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Please enter the number of the month: ");
        int month = input.nextInt();
        String monthStr;
        switch (month) {
            case 1:  monthStr = "January";
                break;
            case 2:  monthStr = "February";
                break;
            case 3:  monthStr = "March";
                break;
            case 4:  monthStr = "April";
                break;
            case 5:  monthStr = "May";
                break;
            case 6:  monthStr = "June";
                break;
            case 7:  monthStr = "July";
                break;
            case 8:  monthStr = "August";
                break;
            case 9:  monthStr = "September";
                break;
            case 10: monthStr = "October";
                break;
            case 11: monthStr = "November";
                break;
            case 12: monthStr = "December";
                break;
            default: monthStr = "Not a month";
                break;
        }
        System.out.println("The name of the month is " + monthStr);
        input.close();

    }
}
