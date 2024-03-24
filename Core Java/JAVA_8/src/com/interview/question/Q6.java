package com.interview.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//double the each no in stream api
public class Q6 {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
		doubleTheNo(l);
	}

	public static void doubleTheNo(List<Integer> l) {
		List<Integer> collect = l.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(collect);
	}

}
