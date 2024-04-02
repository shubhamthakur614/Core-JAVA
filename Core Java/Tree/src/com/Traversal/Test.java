package com.Traversal;

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
		Node curr = head.next;
		Node prev = head;
		while (curr.next != null) {
			curr = curr.next;
			prev = prev.next;
		}
		prev.next = null;
		return;
	}

	public static Node insertAt(int data, Node head, int idx) {

		Node newNode = new Node(data);
//		if (head == null) {
//			head = newNode;
//			return head;
//		}
		if (idx == 0) {
			newNode.next = head;
			head = newNode;
			return head;
		}
		int cnt = 1;
		Node curr = head;
		while (cnt < idx) {
			curr = curr.next;
			cnt++;
		}
		newNode.next = curr.next;
		curr.next = newNode;
		return head;
	}

	public static Node removeAt(Node head, int idx) {
		if (head == null) {
			head = null;
			return head;
		}
		if (idx == 0) {
			head = head.next;
			return head;
		}
		int cnt = 1;
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
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			Node last = curr.next;
			curr.next = prev;
			prev = curr;
			curr = last;
		}
		head.next = null;
		head = prev;
		return head;
	}

	public static Node reverseLL1(Node head) {

		if (head == null || head.next == null) {
			return head;
		}
		Node newhead = reverseLL1(head.next);
		head.next.next = head;
		head.next = null;
		return newhead;
	}

	public static void printLL() {
		if (head == null) {
			return;
		}
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ->");
			curr = curr.next;
		}
		System.out.println("null");
	}

	public static Node deleteFromLast(Node head, int idx) {

		if (head == null || head.next == null) {
			head = null;
			return head;
		}
		int size = length(head);
		Node curr = head;
		int cnt = 1;
		if (idx == size) {
			head = head.next;
			return head;
		}
		int ans = size - idx;
		while (cnt < ans) {
			curr = curr.next;
			cnt++;
		}
		curr.next = curr.next.next;
		return head;
	}

	public static int length(Node head) {
		if (head == null) {
			return 0;
		}
		Node curr = head;
		int cnt = 0;
		while (curr != null) {
			curr = curr.next;
			cnt++;
		}
		return cnt;
	}

	public static Node deleteFromLast1(Node head, int idx) {
		if (head == null) {
			return head;
		}
		Node slow = head;
		Node fast = head;
		while (idx > 0) {
			fast = fast.next;
			idx--;
		}
		if (fast == null) {
			head = head.next;
			return head;
		}
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return head;
	}

	public static void reversePrintLL(Node head) {

		if (head == null) {
			return;
		}
		reversePrintLL(head.next);
		System.out.print(head.data + " ->");
		return;

	}

	public static Node reverseLinkedListBetween(Node head, int left, int right) {
		return null;
	}

	public static Node middle(Node head) {
		int size = length(head);
		int ans = size / 2;
		int cnt = 1;
		Node curr = head;
		while (cnt < ans) {
			curr = curr.next;
			cnt++;
		}
		return curr;
	}

	public static Node firstmiddle(Node head) {
		if (head == null) {
			return head;
		}
		Node fast = head.next;
		Node slow = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;

	}

	public static Node secmiddle(Node head) {
		if (head == null) {
			return head;
		}
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

	public static Node removesorted(Node head) {
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

	public static Node removeunsorted(Node head) {
		Set<Integer> s = new HashSet<>();
		Node curr = head;
		Node prev = null;
		while (curr.next != null) {
			if (s.contains(curr.data)) {

				prev.next = curr.next;
			} else {
				s.add(curr.data);
				prev = curr;
			}
			curr = curr.next;

		}
		return head;
	}

	public static Node floyedCycleDetection(Node head) {
		if (head == null) {
			return head;
		}
		Node slow = head;
		Node fast = head;
		while (fast != null) {
			fast = fast.next;
			if (fast != null) {
				fast = fast.next;
			}
			slow = slow.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

	public static Node detectloopIdx(Node head) {
		if (head == null) {
			return head;
		}
		Node temp = floyedCycleDetection(head);
		if (temp == null) {
			return null;
		}
		Node slow = head;
		while (slow != temp) {
			slow = slow.next;
			temp = temp.next;
		}
		return slow;
	}

	public static Node removeloop(Node head) {
		if (head == null) {
			return head;
		}
		Node temp = detectloopIdx(head);
		if (temp == null) {
			return head;
		}
		Node temp2 = temp;
		while (temp2.next != temp) {
			temp2 = temp2.next;
		}
		temp2.next = null;
		return head;
	}

	public static Node reverseLinkedList(Node head) {
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

	public static Node getkthNode(Node temp, int k) {

		k -= 1;
		while (temp != null && k > 0) {
			k--;
			temp = temp.next;
		}
		return temp;
	}

	public static Node KthGroupReverse(Node head, int k) {

		Node temp = head;
		Node prevLast = null;
		while (temp != null) {
			Node kthNode = getkthNode(temp, k);
			if (kthNode == null) {
				if (prevLast != null) {
					prevLast.next = temp;
				}
				break;
			}
			Node nextNode = kthNode.next;
			kthNode.next = null;
			reverseLinkedList(temp);
			if (temp == head) {
				head = kthNode;
			} else {
				prevLast.next = kthNode;
			}
			prevLast = temp;

			temp = nextNode;
		}
		return head;
	}

	public static void main(String[] args) {

		addFirst(1);
		addLast(2);
		addLast(3);
		addLast(4);
		addLast(5);
		addLast(6);
		printLL();
//		addLast(7);
//		printLL();
//		removeFirst();
//		printLL();
//		removeLast();
//		printLL();
//		head = insertAt(9, head, 2);
//		printLL();
//		head = removeAt(head, 3);
//		printLL();
//		head=reverseLL(head);
//		printLL();
//		head=reverseLL1(head);
//		printLL();
//		reversePrintLL(head);
//		head=deleteFromLast(head,2);
//		printLL();
//		head = deleteFromLast1(head, 4);
//		printLL();
//		head=middle(head);
//		head = firstmiddle(head);
//		head = secmiddle(head);
//		printLL();
//		head = removesorted(head);
//		head = removeunsorted(head);
//		printLL();
		head = KthGroupReverse(head, 4);
		printLL();

	}

}
