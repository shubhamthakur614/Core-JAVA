package com.Basic_Java;

import java.util.HashSet;
import java.util.Set;

public class Test {
	static Node head;

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void printLL(Node head) {
		if (head == null) {
			return;
		}
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + "-> ");
			curr = curr.next;
		}
		System.out.println("null");
	}

	public static void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
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

	public static Node insertAt(Node head, int data, int idx) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return head;
		}
		if (idx == 1) {
			newNode.next = head;
			head = newNode;
			return head;
		}
		int cnt = 2;
		Node curr = head;
		while (cnt < idx) {
			cnt++;
			curr = curr.next;
		}
		newNode.next = curr.next;
		curr.next = newNode;
		return head;

	}

	public static Node removeAt(Node head, int idx) {
		if (head == null || head.next == null) {
			head = null;
			return head;
		}
		if (idx == 1) {
			head = head.next;
			return head;
		}
		int cnt = 2;
		Node curr = head;
		while (cnt < idx) {
			curr = curr.next;
			cnt++;
		}
		curr.next = curr.next.next;
		return head;

	}

	public static Node reverseLL(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		return prev;
	}

	public static Node recursiveReverseLL(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node newHead = recursiveReverseLL(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;

	}

	public static Node findMid(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		int size = length(head);
		int length = size / 2;
		int cnt = 1;
		Node temp = head;
		while (cnt <= length) {
			temp = temp.next;
			cnt++;
		}
		return temp;

	}

	public static int length(Node head) {
		if (head == null) {
			return 1;
		}
		Node curr = head;
		int cnt = 0;
		while (curr != null) {
			curr = curr.next;
			cnt++;
		}
		return cnt;
	}

	public static Node findFirstMid(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node slow = head;
		Node fast = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	public static Node findSecMid(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node slow = head;
		Node fast = head.next;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	// linked list cycle 2
	public static Node findStartignOfLoop(Node head) {
		if (head == null || head.next == null) {
			return null;
		}
		Node fast = head;
		Node slow = head;
		Node temp = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				while (temp != slow) {
					temp = temp.next;
					slow = slow.next;
				}
				return slow;
			}
		}
		return null;
	}

	// bruteforce using hashing
	public static Node intersection(Node h1, Node h2) {

		if (h1 == null && h2 == null) {
			return null;
		}
		Set<Node> s = new HashSet<>();
		while (h1 != null) {
			s.add(h1);
			h1 = h1.next;
		}
		h1 = head;
		while (h2 != null) {
			if (s.contains(h2)) {
				return h2;
			}
			h2 = h2.next;
		}
		return h1;

	}

	// optimal using algorithm
	public static Node intersection2(Node h1, Node h2) {

		if (h1 == null && h2 == null) {
			return null;
		}
		Node t1 = h1;
		Node t2 = h2;
		while (t1 != t2) {
			t1 = t1 == null ? h2 : t1.next;
			t2 = t2 == null ? h1 : t2.next;
		}
		return t1;
	}

//bruteforce approach with using reverse 3 time
	public static Node add1toLL(Node head) {

		head = reverseLL(head);
		Node temp = head;
		int carry = 1;
		while (temp != null) {
			temp.data += carry;
			if (temp.data < 10) {
				carry = 0;
				break;
			} else {
				carry = 1;
				temp.data = 0;
			}
			temp = temp.next;
		}
		if (carry == 1) {
			Node newNode = new Node(carry);
			head = reverseLL(head);
			newNode.next = head;
			head = newNode;
			return head;
		}
		head = reverseLL(head);
		return head;

	}

//optimal approach wing recursive stack 
	public static Node add1toLL2(Node head) {
		int carry = helperMethod(head);
		if (carry == 1) {
			Node newNode = new Node(carry);
			newNode.next = head;
			head = newNode;
			return head;
		}
		return head;

	}

	public static int helperMethod(Node head) {

		if (head == null) {
			return 1;
		}
		int carry = helperMethod(head.next);
		head.data += carry;
		if (head.data < 10) {
			return 0;
		}
		head.data = 0;
		return 1;

	}

	public static void main(String[] args) {
		addFirst(1);
		addFirst(2);
		printLL(head);
		addLast(5);
		addLast(9);
//		addLast(9);
		printLL(head);
//		removeFirst();
//		printLL(head);
//		removeLast();
//		printLL(head);
		head = insertAt(head, 6, 4);
		printLL(head);
		head = removeAt(head, 3);
		printLL(head);
//		head = reverseLL(head);
//		printLL(head);
//		head = recursiveReverseLL(head);
//		printLL(head);
//		head = findMid(head);
//		printLL(head);
//		head = findFirstMid(head);
//		printLL(head);
//		head = findSecMid(head);
//		printLL(head);

//		head = add1toLL(head);
//		printLL(head);
		head = add1toLL2(head);
		printLL(head);
		printLL(head);

	}

}
