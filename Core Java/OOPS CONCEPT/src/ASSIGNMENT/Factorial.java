package ASSIGNMENT;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter the No that you want to find Factorial:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int factorial = facto(n);
		System.out.println("Factorial of "+n+" is :"+factorial);

	}

	public static int facto(int n) {
		int temp = 1;

		if (n == 0) {
			return 1;
		} else {
			for (int i = 1; i <= n; i++) {
				temp = temp * i;
			}
		}
		return temp;
	}

}
