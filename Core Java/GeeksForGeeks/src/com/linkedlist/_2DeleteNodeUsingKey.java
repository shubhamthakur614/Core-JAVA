package com.linkedlist;

//based on input delete that node and prev node link to next node of target node

public class _2DeleteNodeUsingKey 
{
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	public void deleteNode(int key)
	{
		// If linked list is empty
        if (head == null)
        {
        	System.out.println("Linked list is empty");
          return;
        } 
		Node temp=head,prev=null;
		
		//first check head node is contain require key then
		if(temp!=null && temp.data==key)
		{
			head=temp.next;
			return;
		}
		//if not then find upto that using while iterating
		
		while(temp!=null && temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
			
		}
		if(temp==null)
		{
			return;
		}
		prev.next=temp.next;
		
	}
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;

	}
	public void show() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(" null ");
	}
	public static void main(String[] args) 
	{
		_2DeleteNodeUsingKey ll=new _2DeleteNodeUsingKey();
		ll.push(5);
		ll.push(4);
		ll.push(3);
		ll.push(2);
		ll.push(1);
		ll.show();
		ll.deleteNode(3);
		ll.show();
		
		
	}
	

}
