package com.practice.hackerrank;

import java.util.Scanner;

public class Day2_Operators {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        double meal_cost = Double.parseDouble(scanner.nextLine().trim());

        int tip_percent = Integer.parseInt(scanner.nextLine().trim());

        int tax_percent = Integer.parseInt(scanner.nextLine().trim());

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
	
	public static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double tip = (tip_percent / 100.0) * meal_cost;
		
		double tax = (tax_percent / 100.0) * meal_cost;
		
		double total = Math.round(meal_cost + tax + tip);
		
		System.out.println((int) (total));
	}

}
