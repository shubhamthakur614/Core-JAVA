package com.interview.question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//counting the occurrence of the words in array of list with grouping by and using java map concept
public class Q2 {
	public static void main(String[] args) {

		List<String> l
		 = Arrays.asList("AA", "BA", "BC", "AA", "BA");

		String name = "geeks for geeks";
		counting(l, name);
		Counting1(l);
		countingWordFreq(name);

	}

	// using java 8 grouping by with word count and character count
	public static void counting(List<String> l, String name) {

		// calculate the word frequency
		Map<String, Long> collect = l.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(collect);

		// calculating the frequency in single string
		Map<Character, Long> collect2 = name.chars().mapToObj(x -> (char) x).filter(x -> x.charValue() != ' ')
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(collect2);

	}

	public static void Counting1(List<String> name) {
		Map<String, Integer> hm = new HashMap<>();
		for (String s : name) {
			if (hm.containsKey(s)) {
				hm.put(s, hm.get(s) + 1);
			} else {
				hm.put(s, 1);
			}
		}
		for (String s : name) {

			if (hm.get(s) != 0) {
				System.out.println(s + " : " + hm.get(s));
				hm.put(s, 0);
			}
		}

	}

	public static void countingWordFreq(String name) {
		Map<Character, Integer> hm = new HashMap<>();
		for (Character c : name.toCharArray()) {
			if (hm.get(c) != null) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}

		}
		for (int i = 0; i < name.length(); i++) {

			Character c = name.charAt(i);
			if (hm.get(c) != 0 && c != ' ') {
				System.out.println(name.charAt(i) + " : " + hm.get(c));
				hm.put(c, 0);
			}
			;
		}

	}

}
