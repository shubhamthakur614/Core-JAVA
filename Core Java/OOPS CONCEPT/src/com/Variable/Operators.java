package com.Variable;

public class Operators 
{
	
	
	public static void main(String[] args) 
	{
		int i=10;
		int b=10;
		
		System.out.println(i);//10
		System.out.println(i++);//10
		System.out.println(i);//11
		System.out.println(++i);//12
		System.out.println(i);//12
		System.out.println(b);//10
		System.out.println(b--);//10
		System.out.println(b);//9
		System.out.println(--b);//8
		int a=10;
		System.out.println(a++ + ++a);//10+11+1=22
		int c=10;
		System.out.println(c++ + c++);//10+11=21
		int d=10;
		System.out.println(d-- - d--);//10- 1-10=10-9=1
		int e=10;
		System.out.println(e-- + --e);//10-1-1-10;=10-2-10=10-8=2
		String s="shubham";
		int f=10;
		int g=20;
		System.out.println(s+f+g);//shubham+1020
		System.out.println(f+g+s);//30+shubham
		System.out.println(10+20-10*20/2);///*%+- always precedance matter
	    //shift operator
		System.out.println(10>>2);//right shift(no/2^shift)
		System.out.println(10<<2);//left shift(no*2^shift)
		
		
	}

}
