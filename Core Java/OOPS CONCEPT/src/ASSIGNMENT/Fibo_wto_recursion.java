package ASSIGNMENT;

import java.util.Scanner;
// with out using the recursion

//if you want perticular no fibo then print outside while loop
public class Fibo_wto_recursion {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int temp;

		System.out.println("ENTER THE LIMIT FOR FIBONACCI SERIES:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			temp = a + b;
			System.out.println(temp);
			a = b;
			b = temp;
		}
		sc.close();
	}

}
