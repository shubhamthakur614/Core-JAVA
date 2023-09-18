package com.Basic_Java;

import java.util.Scanner;

public class PAtterns
{
	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit of Pattern");
		int n=s.nextInt();
		
//		right angle triangle
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		 left angle triangle
		for(int i=1;i<=n;i++)//outer loop
		{
			for(int j=n-1;j>=i;j--)//space logic
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++)//printing logic
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
//		pyramid
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println("");
			
		}
		
		
//		right angle reverse
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
//		left angle reverse
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
