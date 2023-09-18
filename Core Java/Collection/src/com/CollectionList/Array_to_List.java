package com.CollectionList;
import java.util.*;

import java.util.Arrays;

public class Array_to_List
{
	public static void main(String[] args) 
	{
		String arr[]= {"SHUBHAM","VIRAJ","KARTIK"};
		System.out.println("PRINTING THE ARRAY"+Arrays.deepToString(arr));
		
		//converting the array into list
		
		List<String> l=new ArrayList<String>();
		
		for(String list:arr)
		{
			l.add(list);
		}
		System.out.println("PRINTING THE ARRAY by using list"+l);
	}

}
