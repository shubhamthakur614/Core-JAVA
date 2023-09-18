package com.Collection.Set_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparator_demo_alphabet 
{
	public static void main(String[] args) 
	{
		TreeSet <String>t=new TreeSet<String>(new Myalphabet());
		t.add("A");
		t.add("Z");
		t.add("Q");
		t.add("D");
		t.add("P");
		t.add("V");
		t.add("G");
		t.add("K");
		System.out.println("REVERSE ORDER ALPHABET:"+t);
		
	}

}

class Myalphabet implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=obj2.toString();//both the way you can use for the string object only 
		return -s1.compareTo(s2);
		//if we want default natural sorting remove - sign thats it
	}
}







