package com.array;

//https://leetcode.com/problems/sort-colors/

//leetcode problem 75
//you have to sort the array without using any predefined sorting
//I/P {}
//O/p{}
//time O(n) space O(1)
//dutch flag problem

public class Sort_0s_1s_2s {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 0, 2, 1, 2, 0 };
		int[] swapped = sort2(arr);// sort2(arr)//sort3(arr);
		for (int x : swapped) {
			System.out.print(x + " ");
		}

	}

	// bruteforce approach O(n^2)
	public static int[] sort1(int[] arr) {
		for (int i = 0; i <= arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	// moderate approach using counting the appearace and print on arr O(2N)
	public static int[] sort2(int[] arr) {
		int count0 = 0;
		int count1=0;
		int count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count0++;
			} else if (arr[i] == 1) {
				count1++;
			} else {
				count2++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (i < count0) {
				arr[i] = 0;
			} else if (i >= count0 && i < arr.length-count2) {
				arr[i] = 1;
			} else {
				arr[i] = 2;
			}
		}
		return arr;
	}

	// optimal approach O(N)
	public static int[] sort3(int[] arr) {
		int l = 0;
		int m = 0;
		int h = arr.length - 1;

		while (m <= h) {
			if (arr[m] == 0) // if 0 then swap to its position
			{
				swap(arr, m, l);
				m++;
				l++; // 0, 1, 0, 1, 0, 2, 1, 2, 0
			} else if (arr[m] == 1)// if 1 dont do anything
			{
				m++;
			} else// 2 then swap to lst and then --
			{
				swap(arr, m, h);
				h--;
			}
		}
		return arr;

	}

	public static void swap(int[] arr, int m, int l) {
		int temp = arr[m];
		arr[m] = arr[l];
		arr[l] = temp;
	}
	

}
