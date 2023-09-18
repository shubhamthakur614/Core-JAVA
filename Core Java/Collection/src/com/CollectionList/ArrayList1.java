package com.CollectionList;
import java.util.*;

public class ArrayList1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arl=new ArrayList<String>();
		arl.add("shubham");
		arl.add("viraj");
		arl.add("kartik");
		
		//for iterating of data from array list;
		Iterator it=arl.iterator();
		while(it.hasNext())//to check whether the more iterator available or not
		{
			System.out.println(it.next());//return the current value and move courser to next
		}
		
			
		
	}

}
