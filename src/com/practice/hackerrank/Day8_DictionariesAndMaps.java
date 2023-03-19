package com.practice.hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class Day8_DictionariesAndMaps {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> phoneBook = new HashMap<>();
		
		int entries = scanner.nextInt();
		
		for (int i = 0; i < entries; i++) {
			String name = scanner.next();
			int number = scanner.nextInt();
			
			phoneBook.put(name, number);
		}
		
		while(scanner.hasNext()) {
			String searchFor = scanner.next();
			
			if(phoneBook.containsKey(searchFor)) 
				System.out.println(searchFor + "=" + phoneBook.get(searchFor));
			else 
				System.out.println("Not found");
		}
		
		scanner.close();
	}

}
