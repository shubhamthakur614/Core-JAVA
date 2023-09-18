package com.CollectionList;
import java.util.*;
// how we can sort the element in array list using collections.sort();

public class Arrraylist3 
{
	public static void main(String[] args)
	{
		List<String> l=new ArrayList<String>();
		l.add("APPLE");
		l.add("DOG");
		l.add("XEROX");
		l.add("ACCOUNT");
		
		//sorting using method of collection utility class
		
		Collections.sort(l);
		System.out.println(l);
		
		// sorting of numbers
		List <Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(42);
		l1.add(4);
		l1.add(1);
		
		Collections.sort(l1);
		
		//iterating using the for each loop
		
		for(int i:l1)
		{
			System.out.println(i);
		}
		
		
		
	}

}
