package com.practice.hackerrank;

import java.util.Scanner;

public class Day6_LetsReview {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int testCases = Integer.parseInt(scanner.nextLine()); 
		
		for(int i = 0; i < testCases; i++) {
			String inputString = scanner.nextLine();
			
			printFormattedString(inputString);
		}
		
		scanner.close();
	}

	private static void printFormattedString(String inputString) {
		StringBuilder oddStringBuilder = new StringBuilder();
		StringBuilder evenStringBuilder = new StringBuilder();
		
		for(int i = 0; i < inputString.length(); i++) {
			if(i%2 == 0) evenStringBuilder.append(inputString.charAt(i));
			else oddStringBuilder.append(inputString.charAt(i));
		}
		
		System.out.println(evenStringBuilder.toString() + " " + oddStringBuilder.toString());
	}
	
}
