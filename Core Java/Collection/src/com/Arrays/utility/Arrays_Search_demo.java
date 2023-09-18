package com.Arrays.utility;
import java.util.*;

public class Arrays_Search_demo 
{
	public static void main(String[] args) 
	{
		int [] a= {90,20,40,10,60,70,50};
		Arrays.sort(a);
		System.out.println("SORTED PRIMITIVE ARRAY BY DNSO:");
		for(int i:a)
		{
			System.out.print(i+",");
		}
		System.out.println("\nSEARCH ELEMENT INDEX: "+Arrays.binarySearch(a,40));
		System.out.println("\nSEARCH ELEMENT INDEX: "+Arrays.binarySearch(a,30));
		
		//for object type array
		String s[]= {"Z","A","C","X","S"};
		Arrays.sort(s);
		
		System.out.println("\nSORTED OBJECT ARRAY BY DNSO:");
		for(String i:s)
		{
			System.out.print(i+",");
		}
		
		System.out.println("\nSEARCH ELEMENT INDEX: "+Arrays.binarySearch(s,"S"));
		System.out.println("\nSEARCH ELEMENT INDEX: "+Arrays.binarySearch(s,"D"));
		
		//sorting by customize sorting and then searching by customize searching
		
		Arrays.sort(s,new Myc() );
		System.out.println("\nCustomize sorted array:");
		for(String i:s)
		{
			System.out.print(i+",");
		}
		
		System.out.println("\nSEARCH ELEMENT By Customize search "+Arrays.binarySearch(s,"S",new Myc()));
		System.out.println("\nSEARCH ELEMENT By Customize search: "+Arrays.binarySearch(s,"B",new Myc()));
		
		
	}

}

class Myc implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}
