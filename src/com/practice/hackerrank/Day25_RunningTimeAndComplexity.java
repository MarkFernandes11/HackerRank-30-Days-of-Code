package com.practice.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day25_RunningTimeAndComplexity {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int testCases = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < testCases; i++) {
			int num = Integer.parseInt(reader.readLine());
			isPrime(num);
		}
		
		reader.close();
	}

	private static void isPrime(int num) {
		boolean isPrime = false;
		
		if(num > 1) {
			int divisors = 0;
			
			for (int i = 2; i*i <= num; i++) {
				if(num % i == 0) {
					divisors++;
					break;
				}
			}
			
			isPrime = (divisors == 0);
		}
		
		System.out.println(isPrime ? "Prime" : "Not prime");
	}

}
