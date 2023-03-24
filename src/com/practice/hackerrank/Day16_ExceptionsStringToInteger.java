package com.practice.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16_ExceptionsStringToInteger {
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        
        try {
          System.out.println(Integer.parseInt(s));
        } catch(Exception exception) {
          System.out.println("Bad String");
        }

        bufferedReader.close();
    }

}
