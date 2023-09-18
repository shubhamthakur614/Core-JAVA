package com.String;
//0,0,2,1,4,2,6,3,8,4,10,5,12,6,14,7,16,8

//in this series is the mixture of two series and in odd postion 
//we have even no in increasing order and in even position we have no which is 
// calculated from previous no divide by 2 i.e x/2 in such way we have to cal.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two_series_mixture {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the position you want to see which no in mix series:");
		int number = Integer.parseInt(br.readLine());

		int a = 0;
		int b = 0;

		// check if the no is even postion or odd position first
		// if even
		if (number % 2 == 0) {
			for (int i = 1; i <= (number - 2); i = i + 2) {
				a = a + 2;
				b = a / 2;
			}
			System.out.println("The No present in mix list is: " + b);

		}
		// else odd
		else {
			for (int i = 1; i < (number - 2); i = i + 2) {
				a = a + 2;
				b = a / 2;
			}
			a = a + 2;
			System.out.println("The No present in mix list is: " + a);
		}

	}

}
