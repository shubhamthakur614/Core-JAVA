package com.interview.question;

import java.util.Arrays;
import java.util.List;

//sum of even and odd 
public class Q3 {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(3, 5, 6, 8, 9);
		Integer evenSum = l.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();

		System.out.println("evenSum: "+evenSum);
		Integer oddSum = l.stream().filter(x -> x % 2 != 0).mapToInt(Integer::intValue).sum();
		System.out.println("oddSum: "+oddSum);
	}

}
