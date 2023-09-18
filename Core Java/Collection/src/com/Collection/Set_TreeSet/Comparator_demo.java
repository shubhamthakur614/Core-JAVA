package com.Collection.Set_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparator_demo {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>(new My_comparator_reverse());
		t.add(5);
		t.add(10);
		t.add(7);
		t.add(4);
		t.add(1);
		t.add(8);
		t.add(3);
		System.out.println(t);

		// if we are printing this only
		// becz compiler internally implements comparable and call compareTo method for
		// DNSO
		// but if we use constructor with comparator object then we get o/p what we want

	}

}

class My_comparator_reverse implements Comparator 
{
	public int compare(Object obj1,Object obj2) 
	{
		//assign object to wrapper class bec they by default implements comparable interface
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		//first way of getting output like reverse simplest way
		return -i1.compareTo(i2);
		//second way of getting output like reverse
//		if(i1<i2)
//		{
//			return +1; 
//		}
//		else if(i1>i2)
//		{
//			return -1;
//		}
//		else
//		{
//			return 0;
//		}
		
		//third way if we do
		//return i1.compareTo(i2) we get regular default sorting
		//return -i1.compareTo(i2) we get reverse o/p;
		//return  i2.compareTo(i1) we get reverse o/p;
			
			
	}
}
