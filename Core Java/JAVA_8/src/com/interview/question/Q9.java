package com.interview.question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q9 {
	public static void main(String[] args) {
		Integer[] numbersArray = { 1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 9, 9 };
		List<Integer>l=Arrays.asList(numbersArray);
		List<Integer>list=l.stream().collect(Collectors.groupingBy(i->i,Collectors.counting())).entrySet().stream()
				.filter(entry->entry.getValue()>1).map(entry->entry.getKey()).collect(Collectors.toList());
		list.forEach(System.out::println);

		

		
	}
}
