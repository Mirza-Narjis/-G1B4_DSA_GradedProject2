package com.greatlearning.service;
import com.greatlearning.model.Node;

public class BSTToSkewedTree {
	
	public static Node node;
	public static Node prevNode = null;
	public static Node head = null;
	
	//convert Binary search tree into skewed tree in ascending order
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

	public static void main(String[] args) {
		//Given Binary Search Tree
		//        50
		//       /  \
		//      30   60     
		//     /     /
		//    10    55
		
		BSTToSkewedTree bst = new BSTToSkewedTree();
		//creating Binary Search Tree according to given data
		bst.node = new Node(50);
		bst.node.left = new Node(30);
		bst.node.right = new Node(60);
		bst.node.left.left = new Node(10);
		bst.node.right.left = new Node(55);
		
		//required conversion
		//        10
		//         \
		//          30
		//           \
		//            50
		//             \
		//              55
		//               \
		//                60
		
		BTToSkewed(node); //BST to skewed tree (right)
		
		System.out.println("The order of transaction data after converting Binary Search Tree is: ");
		traverseSkewedTree(head);
	}//main method
}
