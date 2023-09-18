package com.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//how we can find even no from collection using stream

public class Even_no
{
	public static void main(String[] args) {
		//diff way of using list to add element 
//		List<Integer> l= List.of(2, 4, 3, 1, 5, 43, 12, 56);
		
//		List<Integer> l = Arrays.asList(2, 4, 3, 1, 5, 43, 12, 56);
		List<Integer>l=new ArrayList<Integer>();
		l.add(12);
		l.add(25);
		l.add(30);
		l.add(49);
		l.add(53);
		l.add(26);
		l.add(75);
		l.add(89);
		l.add(99);
		l.add(100);
		//normal way is take one data from list and use if to check even
		
		//stream way
		Stream<Integer>stream=l.stream().filter(z->z%2==0);
		//how to use forEach with collection object
		stream.forEach(i->
		{
			System.out.print(i+" ");
		});
		
		System.out.println();
		//stram way if you want to add that even into another list
		List<Integer> collect = l.stream().filter(z->z%2==0).collect(Collectors.toList());
		System.out.println(collect);
		
		
		//w.r.p to find no greater than o from list using stream
		
		Stream<Integer>stream2=l.stream().filter(z->z>=50);
		stream2.forEach(i->
		{
			System.out.print(i+" ");
		}
		);
	}

}
