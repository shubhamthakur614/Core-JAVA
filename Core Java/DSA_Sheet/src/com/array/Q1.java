package com.array;

import java.util.Arrays;

//Reverse the array

public class Q1 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(arr));
		int[] reverseArray = reverseArray(arr);

		System.out.println(Arrays.toString(reverseArray));

	}

	public static int[] reverseArray(int[] arr) {
		// Reverse the Array
		int first = 0;
		int last = arr.length - 1;
		while (first < last) {
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			first++;
			last--;
		}
		return arr;

	}
}
