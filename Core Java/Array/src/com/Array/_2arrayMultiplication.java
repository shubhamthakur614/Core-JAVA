package com.Array;

import java.util.Scanner;

public class _2arrayMultiplication {
	static int product(int[] arr1, int[] arr2, int n) {
		if (n == 0)

			return -1;

		int total = 0;
		for (int i = 0; i < n; i++) {

			total = total + (arr1[i]) * (arr2[n - i - 1]);

		}
		return total;
	}

	public static void main(String[] args) {
		int n, s;
		System.out.println("Enter the size of  array:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the element in Array1:");
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the element in Array at index:" + i);
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the element in Array1:");
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the element in Array at index:" + i);
			arr2[i] = sc.nextInt();
		}

		s = product(arr1, arr2, n);
		System.out.println(s);

	}

}
