package com.Collection_Queue;
import java.util.*;
public class PriortyQueueDemo 
{
	public static void main(String[] args)
	{
		PriorityQueue pq=new PriorityQueue ();
		//check whether is element in queue
		//System.out.println(pq.peek());
		//System.out.println(pq.element());
		
		for(int i=0;i<=10;i++)
		{
			pq.offer(i);
		}
		System.out.println(pq);
		//it will return and remove header element
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq);
	}

}
