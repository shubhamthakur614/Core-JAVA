package com.CollectionList;
import java.util.*;
public class VectorInitialCapacity 
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		System.out.println(v.capacity());
		
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}
		
		System.out.println(v.capacity());
		v.add("SHUBHAM");
		System.out.println("How many element is there:"+v.size());
		System.out.println(v.capacity());
		System.out.println(v);
		
		
	}

}
