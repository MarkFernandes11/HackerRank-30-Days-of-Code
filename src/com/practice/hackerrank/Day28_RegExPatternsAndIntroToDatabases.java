package com.practice.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Day28_RegExPatternsAndIntroToDatabases {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Pattern gmailPattern = Pattern.compile("[a-zA-Z][a-zA-Z.]{0,39}@gmail.com");
        List<String> users = new ArrayList<>();

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                
                // Adding gmail users to list
                if(gmailPattern.matcher(emailID).matches())
                	users.add(firstName);
                
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        // Sorting the users list and printing name on new line
        users.stream().sorted(new MyComparator()).forEach(System.out::println);
        
        bufferedReader.close();
    }
    
}

class MyComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2);
	}
	
}
