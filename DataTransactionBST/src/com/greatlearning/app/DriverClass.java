package com.greatlearning.app;
import com.greatlearning.service.BSTToSkewedTree;
import com.greatlearning.service.Node;

public class DriverClass {
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
		
		bst.BTToSkewed(bst.node); //BST to skewed tree (right)
		
		System.out.println("The order of transaction data after converting Binary Search Tree is: ");
		bst.traverseSkewedTree(bst.head);
	}//main method
}
