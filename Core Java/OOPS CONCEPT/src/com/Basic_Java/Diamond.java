package com.Basic_Java;

import java.util.Scanner;

public class Diamond
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE PATTERN LIMIT:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)//outer loop
		{
			for(int j=i;j<n;j++)//space logic
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)//printing logic
			{
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		for(int i=n;i>=1;i--)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			for(int l=0;l<i-1;l++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		s.close();
		
		
	}

}
