package ASSIGNMENT;

import java.util.Scanner;

public class Reverse_no {
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the No That You want to Reverse EX: 1234" );
		int n=in.nextInt();
		System.out.print("The reverse No is: "+reverse(n));

	}
	
	public static int reverse(int n)
	{
		int rev=0;
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}

}
