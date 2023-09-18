package com.Collecctions.utility;
import java.util.*;

public class BinarySearchDefaultDemo
{
	public static void main(String[] args) 
	{
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");
		System.out.println(l);
		// sort before search otherwise unpredictable op we get
		Collections.sort(l);
		System.out.println(l);
		
		//search using binary search by default
		System.out.println(Collections.binarySearch(l,"M"));//return 2 becz of index search
		System.out.println(Collections.binarySearch(l,"N"));
		
		
		
	}

}
