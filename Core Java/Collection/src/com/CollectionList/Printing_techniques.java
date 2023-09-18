package com.CollectionList;

import java.util.ArrayList;
import java.util.Iterator;

public class Printing_techniques 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("Shubham");
		al.add("Karishma");
		al.add("SNEHA");
		al.add("MAITHLI");
		al.add("SHUBHAM");
		al.add(null);
		//simple printing
		
			System.out.println("USING SIMPLE METHOD: "+al);
		
		//using forEach loop
		System.out.println("\nUSING FOR EACH LOOP:!!!!!!!!!");
		for(Object o:al)
		{
			System.out.println(o);
		}
		
		//using for loop
		System.out.println("\nUSING FOR LOOP:!!!!!!!!!!!");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		//using iterator
		System.out.println("\nUSING ITERATOR!!!!");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Object o1=itr.next();
			System.out.println(o1);
			
		}
		
		
		
		
	}

}
