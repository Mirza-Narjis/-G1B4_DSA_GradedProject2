package com.greatlearning.service;

public class Node {
	public int data;
	public Node left;
	public Node right;
	
	//constructor
	public Node(int num) {
		data = num;
		left = right = null;
	}
}
