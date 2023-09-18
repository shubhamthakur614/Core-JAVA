package com.Collecctions.utility;
import java.util.*;
import java.util.Comparator;

public class Collections_customize_sorting 
{
	public static void main(String[] args) 
	{
		ArrayList l=new ArrayList();
		l.add("B");
		l.add("A");
		l.add("C");
		l.add("Z");
		l.add("S");
		l.add("E");
		System.out.println(l);
		Collections.sort(l,new MComparator());
		System.out.println("AFTER CUSTOM SORTING"+l);
		
	}

}
class MComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}
