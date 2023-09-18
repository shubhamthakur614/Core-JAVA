package com.Basic_Java;

import java.util.Scanner;

public class If_else 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		do
			{
			System.out.println("enter the year:");
			
		int a=s.nextInt();
		
		if((a%4==0 && a%100!=0) || (a%400==0))
		{
			System.out.println("LEAP YEAR");
			
		}
		else
		{
			System.out.println("NOT A LEAP YEAR");
		}
		
			}
		while(true);
		
	}

}
