package com.Collecctions.utility;
import java.util.*;
public class BinarySearchCustomizeDemo 
{
	public static void main(String[] args) 
	{
		ArrayList l=new ArrayList();
		l.add(55);
		l.add(10);
		l.add(14);
		l.add(57);
		l.add(20);
		System.out.println("Insertion order: "+l);
		
		//for reverse the list we have reverse method
		Collections.reverse(l);
		System.out.println("REVERSE THE ORDER"+l);
		
		
		Collections.sort(l,new MyComparator());
		System.out.println("Customized sorting: "+l);
		System.out.println("CUSTOMIZED SEARCHING USING CUSTOMIZE SORTING: "+Collections.binarySearch(l,14,new MyComparator()));
		System.out.println(Collections.binarySearch(l, 13, new MyComparator()));
		
		
		
	}

}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		
		return i2.compareTo(i1);
	}
}
