package com.practice.hackerrank;

import java.util.Scanner;

public class Day9_Recursion3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int factorialOf = scanner.nextInt();
		
		int result = factorial(factorialOf);
		System.out.println(result);
		
		
		scanner.close();
	}

	private static int factorial(int factorialOf) {
		// Base case is 1 (to avoid getting StackOverflowError). Stop if we reach 0
		return factorialOf <= 1 ? 1 : factorialOf * factorial(factorialOf - 1);
	}

	private static int sum(int number) {
		// Base case is 0 (to avoid getting StackOverflowError). Stop if we reach 0
		return number == 0 ? 0 : number + sum(number - 1);
	}
}
