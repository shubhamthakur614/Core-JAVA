package com.linkedlist;
//it need to return eleemtn present in index
public class _6return_element_at_index 
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
	

	public void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;	
	}

	public void returnElement(int position)
	{
		Node temp=head;
		if(head==null)
		{
			return;
		}
		int count=0;
		while(temp!=null)
		{
			if(count==position)
			{
				System.out.println("Element at index " +position+ " is "+temp.data);
			}
			count++;
			temp=temp.next;
		}
	}
	public static void main(String[] args) 
	{
		_6return_element_at_index t=new _6return_element_at_index();
		t.push(6);
		t.push(5);
		t.push(4);
		t.push(3);
		t.push(2);
		t.push(1);
		t.returnElement(3);
		
	
		
	}

}
