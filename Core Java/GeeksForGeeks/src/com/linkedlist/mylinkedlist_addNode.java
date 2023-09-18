package com.linkedlist;
//here we create our own linked list and write three method to add node

//at begining ,at middle and at end how we can add node

public class mylinkedlist_addNode {

	// create static node class so that main method can access

	// Node instance as Head Node
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void show() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}

//			how to insert new node in array list using at biginig add the node and make pointer thead

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;

	}
//			insert the node after given node for that use insert method

	public void insertafter(Node prev_node, int new_data) {
//				check if previous node is null or what
		if (prev_node == null) {
			System.out.println("The given previous node can not be null");
			return;
		}
//				create new node and assign data
		Node new_node = new Node(new_data);
//				make new node next as prev_node next
		new_node.next = prev_node.next;
//				then make prev_node next as new node
		prev_node.next = new_node;
	}

//			Append new node at the end of all node

	public void append(int new_data) {
//				create new node
		Node new_node = new Node(new_data);
//				check if there is no node in ll then make it as node and head
		if (head == null) {
			head = new Node(new_data);
			return;
		}
//				make this node last as null with next;
		new_node.next = null;
//				else traverse therough last node

		Node last = head;
		while (last.next != null)
			last = last.next;

//				change the last of next node
		last.next = new_node;
		return;

	}

	public static void main(String[] args) {
		mylinkedlist_addNode t = new mylinkedlist_addNode();
		t.append(6);
		t.push(9);
		t.push(1);
		t.append(4);
		t.insertafter(t.head.next, 5);
		t.show();

	}

}
