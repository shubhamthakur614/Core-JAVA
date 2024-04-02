package com.Basic_Java;

import java.util.HashSet;
import java.util.Set;

public class Test {
	static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
		return;
	}

	public static void addLast(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
		return;
	}

	public static void printLL() {
		if (head == null) {
			return;
		}
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + "-> ");
			curr = curr.next;
		}
		System.out.println("Null");
	}

	public static void removeFirst() {

		if (head == null || head.next == null) {
			head = null;
			return;
		}
		head = head.next;
		return;
	}

	public static void removeLast() {

		if (head == null || head.next == null) {
			head = null;
			return;
		}
		Node prev = head;
		Node curr = head.next;
		while (curr.next != null) {
			curr = curr.next;
			prev = prev.next;
		}
		prev.next = null;
		return;
	}

	public static Node insertAtIdx(Node head, int idx, int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return head;
		}
		if (idx == 0) {
			newNode.next = head;
			head = newNode;
			return head;
		}
		int count = 1;
		Node temp = head;
		while (count < idx) {
			temp = temp.next;
			count++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
	}

	public static Node removeAtIdx(Node head, int idx) {

		if (head == null || head.next == null) {
			head = null;
			return head;
		}
		if (idx == 0) {
			head = head.next;
			return head;
		}
		int count = 1;
		Node temp = head;
		while (count < idx) {
			temp = temp.next;
			count++;
		}
		temp.next = temp.next.next;
		return head;

	}

	public static void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
		return;
	}

	public static Node reverseLL(Node head) {

		if (head == null) {
			return head;
		}
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			Node last = curr.next;
			curr.next = prev;

			prev = curr;
			curr = last;
		}
		head = prev;
		return head;
	}

	public static Node recursiveLL(Node head) {

		if (head == null || head.next == null) {
			return head;
		}
		Node headNode = recursiveLL(head.next);
		head.next.next = head;
		head.next = null;
		return headNode;
	}

	public static void PrintReverse(Node head) {

		if (head == null) {
			return;
		}
		PrintReverse(head.next);
		System.out.print(head.data + "->");
		return;

	}

	public static Node removeFromLast(Node head, int idx) {

		if (head.next == null || head == null) {
			head = null;
			return head;
		}
		int size = length(head);
		int findIdx = size - idx;
		if (size == idx) {
			head = head.next;
			return head;
		}
		int cnt = 1;
		Node temp = head;
		while (cnt < findIdx) {
			temp = temp.next;
			cnt++;
		}
		temp.next = temp.next.next;
		return head;

	}

	public static Node removeFromLast1(Node head, int idx) {

		Node fast = head;
		Node slow = head;
		while (idx > 0) {
			fast = fast.next;
			idx--;
		}
		if (fast == null) {
			head = head.next;
		}
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return head;
	}

	public static Node sortedduplicateRemove(Node head) {

		if (head == null) {
			return head;
		}
		Node curr = head;
		while (curr.next != null) {
			if (curr.data == curr.next.data) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}
		return head;

	}

	public static Node unsortedDuplicateRemove(Node head) {
		Set<Integer> s = new HashSet<>();
		if (head == null || head.next == null) {
			return head;
		}
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			if (s.contains(curr.data)) {
				prev.next = curr.next;
			} else {
				s.add(curr.data);
				prev = curr;
			}
			curr=curr.next;
		}
		return head;

	}

	public static Node middle(Node head) {

		int length = length(head);
		int ans = length / 2;
		Node temp = head;
		int i = 1;
		while (i < ans) {
			temp = temp.next;
			i++;
		}
		return temp;

	}

	public static int length(Node head) {

		if (head == null) {
			return 0;
		}

		Node temp = head;
		int count = 0;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	public static Node middleFirst(Node head) {
		Node fast = head;
		Node slow = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static Node middleSec(Node head) {
		Node fast = head.next;
		Node slow = head;
		while (fast != null) {
			fast = fast.next;
			if (fast != null) {
				fast = fast.next;
			}
			slow = slow.next;
		}
		return slow;

	}

	public static void main(String[] args) {

		addFirst(1);
		addLast(2);
		addLast(2);
		addLast(2);

		addLast(3);
		addLast(4);
		addLast(4);
		addLast(5);

		addLast(6);
		printLL();
//		removeFirst();
//		printLL();
//		removeLast();
//		printLL();
//		head = insertAtIdx(head, 2, 7);
//		head=removeAtIdx(head, 0);
//		head=reverseLL(head);
//		head = recursiveLL(head);
//		PrintReverse(head);
//		head = removeFromLast(head, 2);
//		head = removeFromLast1(head, 2);
//		head = middle(head);
//		head = middleFirst(head);
//		head = middleSec(head);
//		head = sortedduplicateRemove(head);
		head = unsortedDuplicateRemove(head);
		printLL();
	}

}
