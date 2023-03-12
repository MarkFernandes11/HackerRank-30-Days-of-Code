package com.practice.hackerrank;

import java.util.Scanner;

public class Day0_HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine(); 
		
		System.out.println("Hello, World.");
		System.out.println(inputString);

		scanner.close();
	}

}
