package com.CollectionList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Arraylist_to_Array
{
	public static void main(String[] args) 
	{
		List<String> l=new LinkedList<String>();
		l.add("SAMIKSHA");
		l.add("PARVATI");
		l.add("RAKESH");
		
		
		//converting ArrayList to array
		
		String arr[]=l.toArray(new String[l.size()]);
	
		
		System.out.println("Printing List"+l);
		
		System.out.println("PRinting Array"+Arrays.toString(arr));
		
		
		
		
		
	}

}
