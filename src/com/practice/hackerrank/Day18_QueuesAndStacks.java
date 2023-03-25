package com.practice.hackerrank;

import java.util.Scanner;

public class Day18_QueuesAndStacks {
	
	StringBuilder queue = new StringBuilder();
	StringBuilder stack = new StringBuilder();
	
	private void enqueueCharacter(char ch) {
		queue.append(ch);		
	}
	
	private char dequeueCharacter() {
		char ch = queue.charAt(0);
		queue.deleteCharAt(0);
		
		return ch;
	}
	
	private void pushCharacter(char ch) {
		stack.append(ch);
	}
	
	private char popCharacter() {
		char ch = stack.charAt(stack.length()-1);
		stack.deleteCharAt(stack.length()-1);
		
		return ch;
	}

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18_QueuesAndStacks p = new Day18_QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
	
}
