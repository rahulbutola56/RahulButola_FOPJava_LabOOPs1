package com.gl.pairforsum;

import java.util.HashSet;

class Node{
	int data;
	Node left, right;
	
	Node(int value) {
		data = value;
		left = right = null;
	}
}

public class Pair {
	Node root;
	
	public Pair(Node root) {
		this.root = root;
	}
	
	public static void main(String[] args) {
		CheckPair obj = new CheckPair();
		Node root = new Node(40);
		Pair binaryTree = new Pair(root);
		binaryTree.root.left = new Node(20);
		binaryTree.root.right = new Node(60);
		root.left.left = new Node(10);
		root.left.right = new Node(30);
		root.right.left = new Node(50);
		root.right.right = new Node(70);
		
		obj.SumOfPair(120, root);
	}
}
