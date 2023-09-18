package com.Collection_Queue;

import java.util.PriorityQueue;

public class Priority_queue
{
	public static void main(String[] args) 
	{
		PriorityQueue<String>pq=new PriorityQueue<String>();
		pq.add("shubham");
		pq.add("viraj");
		pq.add("kartik");
		pq.add("sneha");
		pq.add("hritik");
		pq.add("vivek");
		for(String a:pq)
		{
			System.out.println(a);
		}
		System.out.println("Headder Element:"+pq.element());
		System.out.println("Headder Element:"+pq.peek());
		System.out.println(pq.remove());
		System.out.println(pq.poll());
		System.out.println("AFTER REMOVAL");
		for(String a:pq)
		{
			System.out.println(a);
		}
		
		
		
		
	}

}
