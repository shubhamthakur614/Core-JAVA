package ASSIGNMENT;

import java.util.Scanner;

public class PRIME_NO_BETWEEN {
	public static void main(String[] args) {

		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FIRST AND LAST NO:");
		int first = sc.nextInt();
		int last = sc.nextInt();
		System.out.println("THE PRIME NO BETWEEN " + first + " AND " + last + " ARE ");
		for (int i = first; i <= last; i++) {
			boolean isPrime = true;
			if (i > 1) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						isPrime = false;
					}
				}
			} else {
				isPrime = false;
			}
			if (isPrime) {
				System.out.println(i);
				count++;
			}

		}
		System.out.println("\n Total Prime NO Between " + first + " and " + last + " is " + count);

	}

}
