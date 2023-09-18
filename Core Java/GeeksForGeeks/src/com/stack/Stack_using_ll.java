package com.stack;

//Create Stack Using Linked lis
public class Stack_using_ll {
	Node head;
	int size;

	public class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	// creating constructor to initialize value of head
	Stack_using_ll() {
		head = null;
		size = 0;
	}

	// push method
	public void push(int data) {
		Node temp = new Node(data);
		temp.next = head;
		size++;
		head = temp;
	}

	public void pop() {
		if (head == null) {
			System.out.println("stack is Empty...");
		}
		int res = head.data;
		head = head.next;
		size--;
		System.out.println("data popped: " + res);

	}

	public int peek() {
		if (head == null) {
			System.out.println("Stack is Empty....");
			return -1;
		}
		return head.data;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public static void main(String[] args) {
		Stack_using_ll s = new Stack_using_ll();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());

	}

}
