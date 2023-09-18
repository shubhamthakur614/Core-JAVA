package com.stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class Stream_methods 
{
	//filter(predicate)
	//it always gives in the form of true false
	
	//map(function)
	//return into another object form

	public static void main(String[] args) 
	{
		
		//w.r.p to get filter the user based of alphabet
		List<String> names = List.of("shubham","viraj","kanchan","akash","badal");
		List<String> collect = names.stream().filter(z->z.startsWith("a")).collect(Collectors.toList());
		System.out.println(collect);
		
		names.forEach(System.out::println);
		
	//sorted the list
		
		List<Integer> number = List.of(2,4,12,3,17,96,5);
		number.stream().sorted().forEach(System.out::print);
		
		//find the minimum no
		
		Integer i=number.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("\n Minium No from list:"+i);
		
		
	}
}
