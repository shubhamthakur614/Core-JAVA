package com.Collection_Queue_NavigableSet;
import java.util.*;
public class NAvigableSetDemo 
{
	public static void main(String[] args)
	{
		TreeSet <Integer> t=new TreeSet<Integer>();
		t.add(1000);
		t.add(5000);
		t.add(2000);
		t.add(3000);
		t.add(4000);
		System.out.println(t);
		//for higher no
		System.out.println(t.higher(3000));//4000
		//higher no including 3ooo or more
		System.out.println(t.ceiling(3000));//3000
		//lower no 
		System.out.println(t.lower(2000));//1000
		//lower including 2000 or lower
		System.out.println(t.floor(2000));//2000
		System.out.println(t.descendingSet());
		System.out.println("FIRST HEAD ELEMENT REMOVE: "+t.pollFirst());
		System.out.println("LAST ELEMENTS TAIL REMOVE: "+t.pollLast());
		System.out.println(t);
		
		
		
	}

}
