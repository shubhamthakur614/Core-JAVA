package com.lambda.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate1 {
	public static void main(String[] args) {
		// we use predicate in case of condition check
//		and it return the result in boolean true false formet

		List<Integer> l = Arrays.asList(1, 2, 4, 17, 6, 12, 16, 19, 24, 25);
		Predicate<Integer> p = (i) -> i > 5;
		Predicate<Integer> p2 = (i) -> i < 20;
		List<Integer> collect = l.stream().filter(p.and(p2)).collect(Collectors.toList());

		collect.forEach(i -> System.out.println(i));
	}

}
