package com.time_api;

import java.time.Year;

public class Leap_year {
	public static void main(String[] args) {

		int n = 2000;
		Year y = Year.of(n);
		if (y.isLeap()) {
			System.out.println("It is a Leap Year " + y);
		} else {
			System.out.println("it is not a leap Year " + y);
		}

	}

}
