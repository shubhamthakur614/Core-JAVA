package com.linkedlist;

import com.linkedlist._4FindlengthofLL.Node;

public class _5Find_Elemnt_presentinLL 
{
Node head;
	
	static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public void first(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"  ");
			temp=temp.next;
		}
		
	}
	
	public boolean find(Node head,int target)
	{
		Node temp=head;
		while(temp!=null)
		{
		if(temp.data==target)
		{
			return true;
		}
		temp=temp.next;
		}
		
		return false;
	}
	public static void main(String[] args) 
	{
		_5Find_Elemnt_presentinLL ll=new _5Find_Elemnt_presentinLL();
		ll.first(4);
		ll.first(3);
		ll.first(2);
		ll.first(1);
		ll.display();
		System.out.println(ll.find(ll.head.next, 3));
		
	}

}
