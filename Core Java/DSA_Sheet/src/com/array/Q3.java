package com.array;

import java.util.Arrays;

//Maximum and minimum of an array using minimum 
//number of comparisons

//Input: arr[] = {3, 5, 4, 1, 9}
//Output: Minimum element is: 1
//Maximum element is: 9

public class Q3 {

	public static int[] getMinMax(int[] arr) {
		int min = arr[0];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}
		return new int[] { min, max };

	}

	static class pair {
		int min;
		int max;

	}

	public static pair getMinMax1(int[] arr, int n) {
		pair minmax = new pair();

		// if array contain only one elements then return as min and max
		if (n == 1) {
			minmax.min = arr[0];
			minmax.max = arr[0];
			return minmax;
		}
		// if we have more than 1 element then
		if (arr[0] > arr[1]) {
			minmax.min = arr[1];
			minmax.max = arr[0];
		} else {
			minmax.min = arr[0];
			minmax.max = arr[1];
		}
		for (int i = 2; i < n; i++) {
			if (minmax.min > arr[i]) {
				minmax.min = arr[i];
			} else if (arr[i] > minmax.max) {
				minmax.max = arr[i];
			}
		}
		return minmax;
	}

	public static pair getminMax2(int[] arr, int n) {

		pair minMax = new pair();
		int i = 0;
		// if element length in array is even then
		
		if (n % 2 == 0) 
		{
			

		}
		return null;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 5, 4, 1, 9, 9, 1, 3, 5 };

		System.out.println(Arrays.toString(arr));
		int[] maxMinArray = getMinMax(arr);
		System.out.println("Min: " + maxMinArray[0]);
		System.out.println("Max: " + maxMinArray[1]);

		int arr1[] = { 1000, 11, 445, 1, 330, 3000 };
		int n = 6;
		System.out.println(Arrays.toString(arr1));
		pair minMax = getMinMax1(arr1, n);
		System.out.printf(" Minimum value is %d", minMax.min);
		System.out.printf("\n Maximum value is %d", minMax.max);

	}
}
