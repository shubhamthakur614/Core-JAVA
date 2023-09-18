package com.queue;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Queue_using_ll {
	Node front, rear;

	public void enque(int data) {
		Node new_node = new Node(data);

		if (front == null) {
			front = new_node;
			rear = new_node;
		}
		rear.next = new_node;
		rear = new_node;

	}

	public int deque() {
		if (front == null) {
			return -1;
		}
		int result = front.data;
		front = front.next;
		return result;

	}

	public static void main(String[] args) 
	{
		Queue_using_ll q=new Queue_using_ll();
		q.enque(1);
		q.enque(2);
		q.enque(3);
		q.enque(4);
		q.enque(5);
		System.out.println(q.deque());
		

	}

}
