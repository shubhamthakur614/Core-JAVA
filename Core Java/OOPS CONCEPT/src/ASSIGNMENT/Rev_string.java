package ASSIGNMENT;

import java.util.Scanner;

public class Rev_string 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String original=sc.next();
		String rev="";
		
		int length=original.length();
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+original.charAt(i);
		}
		System.out.println("Reverse String:");
		System.out.println(original+":"+rev);
		
	 
		
	}

}
