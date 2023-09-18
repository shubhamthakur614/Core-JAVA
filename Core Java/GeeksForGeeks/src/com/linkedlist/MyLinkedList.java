package com.linkedlist;

public class MyLinkedList 
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public void print()
	{
		Node temp=head;
//		MyLinkedList.Node temp=head;(both are same but as we use inside same class we directly use
		while(temp!=null)
		{
			System.out.print(temp.data+"-> ");
			temp=temp.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args)
	{
		MyLinkedList ll=new MyLinkedList();
//		 to put the value in the node and create three node and link them
		ll.head=new Node(1);
		Node second=new Node(2);
		Node third =new Node(3);
		ll.head.next=second;
		second.next=third;
		//to view the data from the linked list call print method
		ll.print();
		
		
		
	}

}
