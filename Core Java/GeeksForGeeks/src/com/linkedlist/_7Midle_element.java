package com.linkedlist;

/*
 * There are 2 way of finding middle element in ll
 * 1)first find length then dive length/2 and go tho that length and return
 * 2)create two ptr one move one and sec move 2 so get middle at 1st pointer
 * 
 */
public class _7Midle_element {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}

	}

	// display
	public void show() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");

	}
	// first find length

	public int length() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;

	}

	// to find middle element

	public void middle() {
		int length = length();
		System.out.println("TOTAL  ELEMENT: "+length);
		length = length / 2;
		System.out.println("Middle elemnt index: "+length);

		Node temp = head;
		int count = 0;
		while (temp != null) {
			if (length == count) {
				System.out.println("Data present in "+length+" index is: "+temp.data);
			}
			count++;
			temp = temp.next;
		}
	}

	public static void main(String[] args) 
	{
		_7Midle_element t=new _7Midle_element();
		for(int i=8;i>=1;i--)
		{
			t.push(i);
		}
		
		t.middle();

	}

}
