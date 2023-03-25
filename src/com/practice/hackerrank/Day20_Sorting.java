package com.practice.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day20_Sorting {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        
        int totalSwaps = 0;
        
        // If n elements then n-1 swaps
        for (int i = 0; i < n - 1; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;
            
            // Adding i to exclude swapped elements
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j + 1)) {
                    swap(a, j, j + 1);
                    numberOfSwaps++;
                }
            }
            
            totalSwaps += numberOfSwaps;
            
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        
        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size()-1));

        bufferedReader.close();
    }
    
    private static void swap(List<Integer> list, int index1, int index2) {
    	int temp = list.get(index1);
    	list.set(index1, list.get(index2));
    	list.set(index2, temp);
    }
	
}
