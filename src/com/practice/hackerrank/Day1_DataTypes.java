package com.practice.hackerrank;

import java.util.Scanner;

public class Day1_DataTypes {

	public static void main(String[] args) {
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        // Create a Scanner object to read input from stdin.
        Scanner scanner = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;

        /* Read and save an integer, double, and String to your variables.*/
        i2 = Integer.parseInt(scanner.nextLine());
        d2 = Double.parseDouble(scanner.nextLine());
        s2 = scanner.nextLine();
                
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + i2);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + d2);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + s2);

		// Close the scanner object, because we've finished reading all inputs
        scanner.close();
	}

}
