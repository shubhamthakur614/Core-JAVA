package com.Collection.Set_TreeSet;

import java.util.*;
//if you want to use the heterogeneous object in tree set then use the 
//custom sorting order

public class TreeSet_Hetrogenious_by_Custom {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyTreeSet());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");//not printed as it is duplicate
		t.add("VHFD");
		System.out.println(t);

	}

}

class MyTreeSet implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		int I1 = s1.length();
		int I2 = s2.length();
		if (I1 < I2)// before -ve
			return -1;
		else if (I1 > I2)
			return +1;
		else
			return s1.compareTo(s2);

	}
}
