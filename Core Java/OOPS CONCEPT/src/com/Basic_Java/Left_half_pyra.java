package com.Basic_Java;

/*  *
   **
  ***
*****
*
*/
import java.util.Scanner;

public class Left_half_pyra 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NO OF LAYER");
		int a=s.nextInt();
		
		 for(int i=1;i<=a;i++)//outer loop 
			 
		 { 
			 for(int j=a-1;j>=i;j--)//space logic
			 {
				 System.out.print(" ");
		     }
			 for(int k=1;k<=i;k++)//printing logic
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 
		 }
		 
		
		for(int i=1;i<=a;i++)
		{
			for(int j=a;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		 	
	}
	

}
