package com.interview.question;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Q7 {
	public static void main(String[] args) {
		String s = "Welcome, Java Fullstack Developer";
		Map<Character, Long> collect = s.chars().mapToObj(x -> (char) x)
				.filter(x -> x.valueOf(x) != ' ' && x.valueOf(x) != ',')
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(collect);
		mymethod();
	}

	public static void mymethod() {
		int[] arr = { 1, 2, 3, 4, 5, 6 };// 6 2 5 3 1
		int start = 0;
		int end = arr.length - 1;

		System.out.println(Arrays.toString(arr));
		while (start <= end) {
			if (arr[start] % 2 != 0) {
				swap(start, end, arr);
				end--;
			} else {
				start++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void swap(int a, int b, int[] arr) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}
}