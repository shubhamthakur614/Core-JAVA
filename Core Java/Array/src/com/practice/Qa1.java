package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//find the secound lowest and secound highest from list or array using stream api

public class Qa1 {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1, 2, 4, 1, 5, 2, 68, 5, 1, 5, 10, 52, 2);
		Integer secHighest = l.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst()
				.get();
		System.out.println("Sec Highest No: " + secHighest);
		Integer secLowest = l.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
		System.out.println("Sec Lowest No: " + secLowest);
	}

}
