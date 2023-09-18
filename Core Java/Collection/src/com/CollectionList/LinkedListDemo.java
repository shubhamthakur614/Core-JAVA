package com.CollectionList;
import java .util.*;

public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		//add first and addLast method
		LinkedList<String> ll=new LinkedList<>();
		ll.addFirst("SHUBHAM");
		ll.add("ABHIJEET");
		ll.add("Vishwajeet");
		ll.addLast("KANCHAN");
		
		System.out.println("addFirst and addLast method:"+ll);
		
		//removeFirst and removeLast
		
		//getFirst and getLast
		
		System.out.println("GET FIRST:"+ll.getFirst());
		System.out.println("GET LAST:"+ll.getLast());
		
		//peek,peekFirst and peekLast it return only the value
		System.out.println("Peek First: "+ll.peekFirst()+" Peek Last: "+ll.peekLast());
		
		
		
		//poll,pollFirst and pollLast it will return and remove
		System.out.println("POLL FIRST: "+ll.pollFirst()+" POLL LAST: "+ll.pollLast());
		System.out.println("AFTER THE POLL:"+ll);
		
		
		//pop(remove)
		ll.pop();
		System.out.println("AFTER POP:"+ll);
		//push(add)
         ll.push("Rashmi");
         System.out.println("AFTER THE PUSH: "+ll);
         
         //offer,OfferFirst,offerLast
         
         ll.addFirst("SHUBHAM");
         System.out.println("AFTER ADDFIRST: "+ll);
         
         ll.addLast("SNEHA");
         System.out.println("AFTER ADDLAST: "+ll);
		
	}

}
