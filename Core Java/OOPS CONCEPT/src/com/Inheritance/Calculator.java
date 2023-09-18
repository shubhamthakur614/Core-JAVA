//multilevel inheritance;
package com.Inheritance;

import java.util.Scanner;

class Cal
{
	int a,b;
	void value(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
}

class Addition extends Cal
{
	int temp;
	void add()
	{
		temp=a+b;
		System.out.println("Addition is: "+temp);
		
	}
	
}
class Subtraction extends Addition
{
	int temp;
	void sub()
	{
		temp=a-b;
		System.out.println("Subtraction is: "+temp);
	} 
	
}
class Multiplication extends Subtraction
{
	int temp;
	void mul()
	{
		temp=a*b;
		System.out.println("Multiplication is: "+temp);
	} 
	
}
class Division extends Multiplication
{
	int temp;
	void div()
	{
		 temp=a/b;
		 System.out.println("Division is: "+temp);
	} 
	
}
public class Calculator
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Division d=new Division();
		System.out.println("Enter the value of A and B: ");
		int n=s.nextInt();
		int m=s.nextInt();
		
		d.value(n,m);
		d.add();
		d.sub();
		d.mul();
		d.div();
		s.close();
		
	}

}
