package com.Map.sortedmap.treemap;

import java.util.*;

//for customized treeMap 

public class TreeMApDemo2 {
	public static void main(String[] args) 
	{
		TreeMap m=new TreeMap(new MyComparator());
				
		m.put("AAA",101);
		m.put("ZZZ",102);
		m.put("ZZX",109);
		m.put("ZZY",104);
		m.put("XYZ",150);
		m.put("XXY",170);
		m.put("LLL",590);
		System.out.println(m);
		
				
		
		
	}

}

class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = (String) obj1;
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}

}
