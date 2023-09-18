package com.CollectionList;

import java.util.*;

public class TimeDifference {
	public static void main(String[] args) {
//		we get to know how linked list is faster in case of insertion respect to array list

		List<Integer> al = new ArrayList<>();
		List<Integer> ll = new LinkedList<>();
		timediff(al);
		timediff(ll);

	}
	
	//function to check the time difference
	public static void timediff(List<Integer>list)
	{
		long start=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		{
			list.add(0,i);
		}
		long end=System.currentTimeMillis();
		System.out.println(list.getClass().getName()+" "+(start-end));
		
	}

}
