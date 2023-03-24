package com.practice.hackerrank;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

public class Day15_LinkedList {

    public static  Node insert(Node head,int data) {
    	Node currentNode = head;
    	Node newNode = new Node(data);;
    	
    	// Case if linked list is empty
    	if(currentNode == null) {
    		return newNode;
    	}

    	while(currentNode != null) {
    		// If next node is null then assigning the new node to its next node
    		if(currentNode.next == null) {
    			currentNode.next = newNode;
    			break;
    		}
    		
    		currentNode = currentNode.next;
    	}
    	
    	return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
