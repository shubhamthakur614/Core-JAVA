package com.interview.question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//FInd the duplicate Elements in array or list
public class Q4 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 12, 17, 54, 18, 17, 12);
		duplicate(list);
		Integer[] l = { 10, 12, 17, 54, 18, 17, 12 };
		duplicate1(l);

	}

	public static void duplicate(List<Integer> list) {
		Set<Integer> s = new HashSet();
		Set<Integer> collect = list.stream().filter(x -> !s.add(x)).collect(Collectors.toSet());
		System.out.println(collect);
	}

	public static void duplicate1(Integer[] l) {

		// first from integer array create list of integer
		List<Integer> ll = Arrays.asList(l);

		List<Integer> list = ll.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet()
				.stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey())
				.collect(Collectors.toList());
		// print the result using forEach
		list.forEach(System.out::println);

		Map<Integer, Long> collect = ll.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));

	}

}
