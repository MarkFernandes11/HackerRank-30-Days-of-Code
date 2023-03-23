package com.practice.hackerrank;

import java.util.Scanner;

public class Day14_Scope {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
	
}

class Difference {
  	private int[] elements;
  	public int maximumDifference;

	public Difference(int[] elements) {
		this.elements = elements;
	}

	public void computeDifference() {
		maximumDifference = Integer.MIN_VALUE;
		
		for (int i = 0; i < elements.length - 1; i++) {
			for (int j = i+1; j < elements.length; j++) {
				int difference = Math.abs(elements[i] - elements[j]);
				maximumDifference = Math.max(difference, maximumDifference);
			}
		}
	}
}