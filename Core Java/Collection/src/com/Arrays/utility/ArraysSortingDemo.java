package com.Arrays.utility;
import java.util.*;

public class ArraysSortingDemo 
{
	public static void main(String[] args)
	{
		//Primitive type array
		int a[]= {50,40,10,80,20,40,90};
		System.out.println("primary data type array before Sorting:");
		
		for(int s:a)
		{
			System.out.print(s+",");
		}
		
		//after sorting DNSO
		
		Arrays.sort(a);
		System.out.println("\nAFTER DNSO ARRAY WILL BE: ");
		for(int s:a)
		{
			System.out.print(s+",");
		}
		
		//for object array like string ,employee etc..
		
		String [] s= {"Z","A","C","V","S","G"};
		System.out.println("\nBEFORE SORTING OBJECT ARRAY WILL BE: ");
		for(String s1:s)
		{
			System.out.print(s1+",");
		}
		//after the sorting the object array will be
		Arrays.sort(s);
		System.out.println("\nAFTER SORTING DNSO OBJECT ARRAY WILL BE: ");
		for(String s1:s)
		{
			System.out.print(s1+",");
		}
		
		//for customize sorting of arrays
		System.out.println("\n Customize sorting of array:" );
		Arrays.sort(s,new MyComparator());
		for(String s1:s)
		{
			System.out.print(s1+",");
		}
		
		
		
		
		
	}

}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}
