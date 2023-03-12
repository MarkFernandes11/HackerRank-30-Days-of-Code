package com.practice.hackerrank;

import java.util.Scanner;

public class Day0_HelloWorld {

	public static void main(String[] args) {
		// Create a Scanner object to read input from stdin.
		Scanner scanner = new Scanner(System.in);
		
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scanner.nextLine(); 
		
		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
		
		// TODO: Write a line of code here that prints the contents of inputString to stdout.
		System.out.println(inputString);

		// Close the scanner object, because we've finished reading all inputs
		scanner.close();
	}

}
