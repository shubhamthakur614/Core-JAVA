package com.Traversal;

//2,4,7,-1,-1,-1,1,8,-1,-1,3,-1,-1
/*                                            
                       2                                               
                   4      1                           
                 7     8    3                           
                                                            
*/

import java.util.Scanner;

public class TreeTraversal {
	static Scanner sc = null;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		Node root=createTree();
		inOrder(root);
		System.out.println(": Inorder Traversal");
		preOrder(root);
		System.out.println(":PreOrder Traversal");
		postOrder(root);
		System.out.println(":PostOrder Traversal");

	}

	static Node createTree() {
		Node root = null;
		System.out.println("Enter Data:");
		int Data=sc.nextInt();
		if(Data==-1) return null;
		root=new Node(Data);
		System.out.println("Enter left For: "+Data);
		root.Left=createTree();
		System.out.println("Enter Right for: "+Data);
		root.Right=createTree();

		return root;
	}
	
	static void inOrder(Node root)
	{
		if(root==null) return;
		
		inOrder(root.Left);
		System.out.print(root.Data+" ");
		inOrder(root.Right);
	}
	
	static void preOrder(Node root)
	{
		if(root==null) return;
		
		System.out.print(root.Data+" ");
		inOrder(root.Left);
		inOrder(root.Right);
	}
	
	static void postOrder(Node root)
	{
		if(root==null) return;

		postOrder(root.Left);
		postOrder(root.Right);
		System.out.print(root.Data+" ");
	}

}

class Node {
	Node Left, Right;
	int Data;

	public Node(int Data) {
		this.Data = Data;
	}
}
