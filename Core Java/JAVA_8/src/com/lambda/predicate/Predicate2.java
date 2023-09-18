package com.lambda.predicate;

//predicate with OR operator
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate2 {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("A", "AA", "AVC", "BB", "BBB", "CSSS");
		Predicate<String> p = (i) -> i.length() > 3;
		Predicate<String> p1 = (i) -> i.startsWith("A");
		List<String> collect = l.stream().filter(p.or(p1)).collect(Collectors.toList());
		collect.forEach(i -> System.out.println(i));
	}

}
