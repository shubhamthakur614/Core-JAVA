package com.linkedlist;
//first curr node is head

//prev node is null

public class Reverse_LL {
	static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void show(Node head) {
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.println("null");
	}

	public Node reverse(Node head) 
	{
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;

		}
		return prev;
	}

	public static void main(String[] args) {
		Reverse_LL l = new Reverse_LL();
		l.head = new Node(1);
		Node sec = new Node(2);
		Node third = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);

		l.head.next = sec;
		sec.next = third;
		third.next = four;
		four.next = five;

		l.show(head);
		head = l.reverse(head);
		l.show(head);

	}

}
