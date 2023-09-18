package com.Basic_Java;
import java.util.*;

public class Switch 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE TWO VALUE:");
		int a=s.nextInt();
		int b=s.nextInt();
		do {
		System.out.println("Enter Your choice:1.addition \t 2.sub \t 3.mul \t 4.div ");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1->System.out.println(a+b);
		case 2->System.out.println(a-b);
		case 3->System.out.println(a*b);
		case 4->System.out.println(a/b);
		default->System.out.println("Enter the correct one");
		}
	
		}
		while(true);
	}

}
