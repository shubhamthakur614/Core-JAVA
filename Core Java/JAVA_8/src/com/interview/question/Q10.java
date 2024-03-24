 
package com.interview.question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Return the non repeating string from array
public class Q10 {
	public static void main(String[] args) {
		String[] arr = { "aa", "bb", "bb", "c" };
		nonReaptingString(arr);
		List<String> nonRepeatingList = nonRepeatingList(arr);
		System.out.println(nonRepeatingList);

	}

	public static void nonReaptingString(String[] arr) {

		// using grouping by

		Map<String, Long> occurance = Arrays.stream(arr)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// print only the non repeating
		for (int i = 0; i < arr.length; i++) {
			if (occurance.get(arr[i]) == 1) {
				System.out.println(arr[i]);
			}
		}

	}

	// if i want to return list<String> then we will use like this
	public static List<String> nonRepeatingList(String[] arr) {
		Map<String, Long> occurance = Arrays.stream(arr)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return Arrays.stream(arr).filter(s -> occurance.get(s) == 1).collect(Collectors.toList());

	}

}
