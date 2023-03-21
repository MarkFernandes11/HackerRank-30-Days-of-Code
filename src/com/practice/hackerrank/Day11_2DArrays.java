package com.practice.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day11_2DArrays {
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        findMaxHourGlassSum(arr);

        bufferedReader.close();
    }

	private static void findMaxHourGlassSum(List<List<Integer>> arr) {
		int maxSum = Integer.MIN_VALUE;
		for (int row = 0; row < arr.size()-2; row++) {
			int sum = 0;
			for (int col = 0; col < arr.get(0).size()-2; col++) {
				sum = getHourGlassSum(arr, row, col);
				
				maxSum = Math.max(maxSum, sum);
			}
		}
		
		System.out.println(maxSum);
	}
	
	private static int getHourGlassSum(List<List<Integer>> arr, int row, int col) {
		return arr.get(row).get(col) + arr.get(row).get(col+1) + arr.get(row).get(col+2) + arr.get(row+1).get(col+1) 
				+ arr.get(row+2).get(col) + arr.get(row+2).get(col+1) + arr.get(row+2).get(col+2); 
	}

}
