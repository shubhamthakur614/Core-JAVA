package com.Exception_handling;

import java.util.Scanner;

class toyoung extends RuntimeException {
	public toyoung(String s) {
		super(s);
	}
}

class toold extends RuntimeException {
	public toold(String s) {
		super(s);
	}

}

class boy extends RuntimeException
{
	public boy(String s)
	{
		super(s);
	}
	
}

class girl extends RuntimeException
{
	public girl(String s)
	{
		super(s);
	}
}

public class Matromoneyapp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\t Welcome to Matromoney App!!!!!!!!!!!!");
		System.out.println("\nENTER YOUR AGE:");
		int age = sc.nextInt();
		System.out.println("\n Are you Boy or Girl : B/G ");
		char c = sc.next().charAt(0);

		if (c == 'b' || c == 'B') 
		{

			if (age>6 && age<=22) 
			{
				throw new boy("Wait Until Your age is above 22");

		    } 
			else if (age>22 && age<=35)
			{
				System.out.println("When we get Some Match for You we Will Mail you Regarding that!!!!!!!!!");
			}

			else if (age > 50)
			{
				throw new toold("YOUR AGE IS OUT OF THE MARRIAGE LIMIT");

			}
			else
			{
				System.out.println("Too young for think about Marriage , Forget About Marriage And  enjoy your Childhood!!!!!!");
			}
			

		}

		else if (c == 'g' || c == 'G') 
		{
			if (age>6 && age<=18) 
			{
				throw new girl("Wait Until Your age is above 18 ");
			}

			else if (age>=19 && age<=35) 
			{
				System.out.println("When we get Some Match for You we Will Mail you Regarding that!!!!!!!!!");
			}

			else if (age >= 50) 
			{
				throw new toold("YOUR AGE IS OUT OF THE MARRIAGE LIMIT");

			}
			
			else
			{
				System.out.println("Too young for think about Marriage , Forget About Marriage And  enjoy your Childhood!!!!!!");
			}

		}
		
	}

}
