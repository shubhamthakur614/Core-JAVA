package com.Array;

//write a program to take an array of diff no and arrrage them based on midle no of the digit 
//and if middle no is same then arrange by the actual no

//like i/p 202,101,434,343
//op 101,102,434,343

public class Middle_no_ascending_order {
	// to find the middle no
	public static int middle(int n) {
		int no = n;
		int count = 0;

		// cal the count first
		while (no != 0) {
			no = no / 10;
			count++;
		}

		int p = (int) Math.pow(10, count / 2);
		return (n / p) % 10;

	}

	public static int[] asending_order(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// here we get the middle from middle method
				int a = middle(arr[i]);
				int b = middle(arr[j]);

				if (a > b) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

				// if both the middle is same then we can solve through complete no comparison

				if (a == b && arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		return arr;

	}

	public static void print(int[] arr) {
		for (int z : arr) {
			System.out.print(z + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 202, 101, 434, 343 };

		print(arr);
		asending_order(arr);
		print(arr);

	}

}
