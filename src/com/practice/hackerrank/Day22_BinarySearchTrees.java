package com.practice.hackerrank;

import java.util.Scanner;

class Node2 {
	Node2 left, right;
	int data;

	Node2(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day22_BinarySearchTrees {

	public static int getHeight(Node2 root) {
		// Returning -1 because the root is not considered in the total height
		if(root == null) return -1;
		else {
			int leftHeight = getHeight(root.left);
			int rightHeight = getHeight(root.right);
			
			return (leftHeight >= rightHeight) ? 1 + leftHeight : 1 + rightHeight;
		}
	}

	public static Node2 insert(Node2 root, int data) {
		if (root == null) {
			return new Node2(data);
		} else {
			Node2 cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node2 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
		
		sc.close();
	}
}