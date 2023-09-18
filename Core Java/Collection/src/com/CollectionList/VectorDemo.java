package com.CollectionList;
import java.util.*;
public class VectorDemo 
{
	public static void main(String[] args)
	
	{
		//Creating the vector list
		
		Vector<String> v=new Vector<String>(4);//creating using initial capacity constructor
		
		//adding elements using two types
		
		v.add("Lion");
		v.addElement("Tiger");
		v.addElement("Cow");
		v.addElement("Eliphant");
		
		
		System.out.println("Checking the Default Size: "+v.size());
		System.out.println("Checking the Default Capacity: "+v.capacity());
		
		System.out.println(v);
		
		v.addElement("Monkey");
		v.addElement("Jiraff");
		System.out.println("After adding the element the  Size: "+v.size());
		System.out.println("After adding the element the  Capacity: "+v.capacity());
		
		System.out.println(v);
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		if(v.contains("Tiger"))
		{
			System.out.println("Tiger is present in index "+v.indexOf("Tiger"));
			
		}
		else
		{
			System.out.println("tiger is not present in the list");
		}
		
		System.out.println(v.elementAt(5));
		
		
		
	

	}

}
