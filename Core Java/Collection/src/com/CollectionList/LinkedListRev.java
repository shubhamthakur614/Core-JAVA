package com.CollectionList;
import java.util.*;
public class LinkedListRev 
{
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("shubham");
		ll.add("Karishma");
		ll.add("PRACHI");
		ll.add("Pratiksha");
		
		System.out.println("LINKED LIST ORDER"+ll);
		
		//reverse the list using different ways 1 way
		Collections.reverse(ll);
		System.out.println("FIRST WAY USING REVERSE() "+ll);
		
		// 2 way()
		 Collections.sort(ll,Collections.reverseOrder());
		
		 System.out.println("Secound way by sorting then reverse:"+ll);
		 
		 //3rd way using the iterator
		 
		 Iterator itr=ll.descendingIterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
		 

	}
}
