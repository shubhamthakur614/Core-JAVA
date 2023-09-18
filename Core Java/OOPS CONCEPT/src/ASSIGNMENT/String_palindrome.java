package ASSIGNMENT;

import java.util.Scanner;

public class String_palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING WHICH YOU WANT TO CHECK WHETHER PALIDROME OR NOT");
		String original=sc.next();
		
		String rev="";
		int length=original.length();
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+original.charAt(i);
		}
		if(original.equals(rev))
		{
			System.out.println(original+": it is palindrome");
			
		}
		else
		{
			System.out.println(original+": it is not palindrome");
		}
		sc.close();
		
	}

}
