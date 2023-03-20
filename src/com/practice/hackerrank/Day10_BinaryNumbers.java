package com.practice.hackerrank;

import java.util.Scanner;

public class Day10_BinaryNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int max1s = 0;
		int consecutive1s = 0;
		
		while(n != 0) {
			if(n%2 == 1) {
				consecutive1s++;
				max1s = (consecutive1s > max1s) ? consecutive1s : max1s;
			} else { 
				consecutive1s = 0;
			}
			
			n /= 2;
		}
		
		System.out.println(max1s);
		
		scanner.close();
	}

}
