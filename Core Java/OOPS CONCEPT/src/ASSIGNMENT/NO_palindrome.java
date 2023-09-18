package ASSIGNMENT;

import java.util.Scanner;

public class NO_palindrome 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER WHICH YOU WANT TO CHECK WHETHER PALIDROME OR NOT");
		int n=sc.nextInt();
		
		int temp,rev=0,r;
		temp=n;
		
		while(temp>0)
		{
			r=temp%10;
			rev=rev*10+r;
			temp=temp/10;
			
		}
		if(rev==n)
		{
			System.out.println(n+": IT IS A PALINDROME");
		}
		else
		{
			System.out.println(n+": IT IS NOT PALINDROME");
		}
		sc.close();
		
		
		
	}

}
