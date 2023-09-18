package com.time_api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Local_time {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("Local Time is: " + time);
		// you want time in your formet then
		int hr = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		System.out.println("our Formet Time");
		System.out.printf("%d hr:%d min:%d sec", hr, min, sec);
		LocalDate date = LocalDate.now();
		System.out.println("\n Local Date is : " + date);

		// how to get the value in india style format
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		System.out.println(dd + "-" + mm + "-" + yyyy);
		// or we can formet by using printf
		System.out.println("Formeted style");
		System.out.printf("%d/%d/%d", dd, mm, yyyy);

//		//your own date and time
		LocalDate date1 = LocalDate.of(1996, 04, 13);
		System.out.println("\n Date of Birth: " + date1);
		int dd1 = date1.getDayOfMonth();
		int mm1 = date1.getMonthValue();
		int yyyy1 = date1.getYear();
		System.out.println("formeted Date: ");
		System.out.printf("%d-%d-%d", dd1, mm1, yyyy1);

		// how to find your age from date of birth by period.between

		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1996, 4, 13);
		Period p = Period.between(birthday, today);
		System.out.printf("\n your Age is %d years %d month and %d day", p.getYears(), p.getMonths(), p.getDays());

		// how many days remaining
		LocalDate finalday = LocalDate.of(1996 + 60, 04, 13);
		Period dayleft = Period.between(today, finalday);
		System.out.printf("\n The time remaining for me is :%d ,",
				dayleft.getYears() * 365 + dayleft.getMonths() * 30 + dayleft.getDays());;

				//if you want to convert string date into local date we 
				// use parse
				
				LocalDate ld1=LocalDate.parse("1996-04-13");
				System.out.println("\n"+ld1);
	}

}
