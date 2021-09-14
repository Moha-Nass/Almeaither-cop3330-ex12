package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Exercise 12 - Computing Simple Interest");
        double p,i, y,A;
        System.out.print("Enter the principal: ");
        Scanner in = new Scanner(System.in);
        p = Double.parseDouble(in.next());

        System.out.print("Enter the rate of interest: ");
        i = Double.parseDouble(in.next());

        System.out.print("Enter the number of years: ");
        y = Double.parseDouble(in.next());

        A = p*(1+(i*y)/100.0);

        System.out.print("After " + y + " at " + i + "% the investment will be worth $"+A+".");
    }
}
