package com.greatlearning.service;

public class BSTToSkewedTree{
	public static Node node;
	public static Node prevNode = null;
	public static Node head = null;
	
	//convert BST to skewed tree in ascending order
	public static void BTToSkewed(Node root) {
		if(root == null)
		{
			return;
		}
		else
		{
			BTToSkewed(root.left);
		}
		
		Node rightNode = root.right;
		Node leftNode = root.left;
		
		if(head == null)
		{
			head = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		
		BTToSkewed(rightNode);
	}
	
	public static void traverseSkewedTree(Node root) {
		if(root == null)
		{
			return;
		}
		System.out.print(root.data + " ");
		traverseSkewedTree(root.right);
	}
}

