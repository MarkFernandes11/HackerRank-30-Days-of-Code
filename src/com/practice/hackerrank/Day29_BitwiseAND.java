package com.practice.hackerrank;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Day29_BitwiseAND {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            String[] firstMultipleInput = scanner.nextLine().replaceAll("\\s+$", "").split(" ");

			int count = Integer.parseInt(firstMultipleInput[0]);

			int lim = Integer.parseInt(firstMultipleInput[1]);

			int res = Result.bitwiseAnd(count, lim);
			
			System.out.println(res);
        });

        scanner.close();
    }

}

class Result {
	
	public static int bitwiseAnd(int count, int lim) {
		int max = Integer.MIN_VALUE;
		
		for (int i = 1; i <= (count - 1); i++) {
			for (int j = i + 1; j <= count; j++) {
				
				if((i & j) < lim) max = Math.max(max, i & j);
				
			}
		}
		
		return max;
	}
	
}
