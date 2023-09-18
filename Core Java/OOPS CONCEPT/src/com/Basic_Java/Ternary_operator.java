package com.Basic_Java;
import java.util.*;

public class Ternary_operator 
{
	public static void main(String[] args)
	{
		System.out.println("enter the age:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		String st=(a>=18)?"YOU CAN VOTE":"YOU ARE NOT ELIGIBLE";
		System.out.println(st);
		
		
	}

}
