package com.Collection_Queue_NavigableSet;
import java.util.*;

public class NavigableMapDemo 
{
	public static void main(String[] args) 
	{
		TreeMap<String,String>m=new TreeMap<String,String>();
		m.put("E"," Eliphant");
		m.put("D"," Dog");
		m.put("A","Apple ");
		m.put("G ","GUN ");
		m.put("C","CAT");
		System.out.println(m);
		
		System.out.println(m.ceilingKey("D"));
		System.out.println(m.higherKey("B"));
		System.out.println(m.floorKey("C"));
		System.out.println(m.lowerKey("C"));
		System.out.println(m.pollFirstEntry());
		System.out.println(m.pollLastEntry());
		System.out.println(m.descendingMap());
		System.out.println(m);
		
	}

}
