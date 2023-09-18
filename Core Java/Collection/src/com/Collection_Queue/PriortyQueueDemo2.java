package com.Collection_Queue;
import java.util.*;

//for customize sorting in priority queue

public class PriortyQueueDemo2 
{
	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue(new myComparator());
		pq.offer("AAA");
		pq.add("ZZZ");
		pq.add("LLL");
		pq.offer("SSS");
		System.out.println(pq);
		
		
	}

}

class myComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}
