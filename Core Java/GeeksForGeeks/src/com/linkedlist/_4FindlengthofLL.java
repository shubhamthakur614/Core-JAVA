package com.linkedlist;

public class _4FindlengthofLL 
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
	
	//iterative method
	int count=0;
	public void length()
	{
		System.out.println("This how we can find the length using iterative method:");
		Node curr_position=head;
		while(curr_position!=null)
		{
			curr_position=curr_position.next;
			count++;
		}
		System.out.println("Length of Linked List: "+count);
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
	public static void main(String[] args)
	{
		_4FindlengthofLL t=new _4FindlengthofLL();
		
		t.first(4);
		t.first(3);
		t.first(2);
		t.first(1);
		t.display();
		//iterative way
		t.length();
		
	
		
	}

}
