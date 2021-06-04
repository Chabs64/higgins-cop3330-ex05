package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Chad Higgins
 */

/*
You’ll often write programs that deal with numbers. And depending on the programming language you use,
you’ll have to convert the inputs you get to numerical data types.

Write a program that prompts for two numbers.
Print the sum, difference, product, and quotient of those numbers as shown in the example output:

Example Output
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Constraints
Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
Keep the inputs and outputs separate from the numerical conversions and other processing.
Generate a single output statement with line breaks in the appropriate spots.
 */

import java.util.Scanner;

import static java.lang.Integer.decode;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.println( "What is the first number? ");
        String num1 = in.nextLine();


        System.out.println("What is the second number? ");
        String num2 = in.nextLine();

        int val1 = decode(num1);

        int val2 = decode(num2);

        print(val1, val2);
    }

    private static void print(int val1, int val2) {

        System.out.println(val1 + " + " + val2 + " = " + (val1+val2) + "\n" +
                val1 + " - " + val2 + " = " + (val1-val2) + "\n" +
                val1 + " * " + val2 + " = " + (val1*val2) + "\n" +
                val1 + " / " + val2 + " = " + (val1/val2) );
    }
    
}
