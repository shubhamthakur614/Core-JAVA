package com.Basic_Java;

import java.util.Scanner;

public class SwitchExample 
{
	static char grade;
	public static void main(String[] args) 
	{
		System.out.println("Enter the marks for 5 subject:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int total = a + b + c + d + e;
		int sum = total / 5;
		System.out.println("Total % are:" + sum);

		if (sum >= 35 && sum < 50) {
			grade = 'D';
		} else if (sum >= 50 && sum < 60) {
			grade = 'C';
		} else if (sum >= 60 && sum < 70) {
			grade = 'B';
		} else if (sum >= 70 && sum < 75) {
			grade = 'A';
		} else {
			grade = 'F';
		}

		switch (grade) {
		case 'A':
			System.out.println("You get A grade" + sum);
			break;
		case 'B':
			System.out.println("You get B grade" + sum);
			break;
		case 'C':
			System.out.println("You get C grade" + sum);
			break;
		case 'D':
			System.out.println("You get D grade" + sum);
			break;
		case 'F':
			System.out.println("You are fail");
			break;

		}
		
		
	}

}
