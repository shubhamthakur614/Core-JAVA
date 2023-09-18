package com.Arrays.utility;
import java.util.*;

public class Array_to_list 
{
	public static void main(String[] args) 
	{
		
		String s[]= {"A","B","C","D"};
		List l=Arrays.asList(s);
		System.out.println(l);
		s[0]="S";
		System.out.println(l);
		l.set(2, "H");
		System.out.println(l);
		//but we can not do any operation which lead to change in array size
		//l.add("E");
		//l.remove(2);
		//l.set(1,new Integer(10));
		//System.out.println(l);
	}

}
