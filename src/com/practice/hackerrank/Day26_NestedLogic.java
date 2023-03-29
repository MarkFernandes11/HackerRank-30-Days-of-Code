package com.practice.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class Day26_NestedLogic {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//		Enter date in format : dd mm yyyy
		String returnDate = reader.readLine();
		String dueDate = reader.readLine();
		
		calculateFine(returnDate, dueDate);
		
		reader.close();
	}

	private static void calculateFine(String returnDate, String dueDate) {
		int fine = 0;
		int[] returnArr = Arrays.stream(returnDate.split("\\s")).mapToInt(Integer::parseInt).toArray();
		int[] dueArr = Arrays.stream(dueDate.split("\\s")).mapToInt(Integer::parseInt).toArray();
		
		GregorianCalendar returnCal = new GregorianCalendar(returnArr[2], returnArr[1], returnArr[0]);
		GregorianCalendar dueCal = new GregorianCalendar(dueArr[2], dueArr[1], dueArr[0]);
		
		if(returnCal.after(dueCal)) {
			if(returnArr[2] > dueArr[2]) fine = 10000;
			else if(returnArr[1] > dueArr[1]) fine = 500 * (returnArr[1] - dueArr[1]);
			else if(returnArr[0] > dueArr[0]) fine = 15 * (returnArr[0] - dueArr[0]);
		}
		
		System.out.println(fine);
	}

}
