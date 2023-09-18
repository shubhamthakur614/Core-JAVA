package com.CollectionList;
import java.util.*;
// how we can get and set the element in the array list

public class Arraylist2 
{
	public static void main(String[] args) 
	{
		ArrayList<String>l=new ArrayList<String>();
		l.add("MANGO");
		l.add("BANANA");
		l.add("ORANGE");
		l.add("GRAPES");
		
		System.out.println(l);
		
		//we can get particular element by get method
		
		System.out.println(l.get(2));
		
		//if you want to replace the element the u use set()
		
		l.set(1, "STROWBERRY");
		
		//traversing using iterator
		System.out.println("traversing using iterator");
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//adding the extra things
		
		List<String >l1=new ArrayList<String>();
		l1.add("COCONUT");
		l1.add(" WATERMEALON");
		
		l.addAll(l1);
		System.out.println(l);
		
		// remove particular element by name 2 type by lambda method
		
		l.removeIf(str->str.contains("COCONUT"));
		System.out.println(l);
		
		l.retainAll(l1);
		System.out.println(l);
		
		
	}

}
