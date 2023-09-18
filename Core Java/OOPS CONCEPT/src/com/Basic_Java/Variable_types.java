package com.Basic_Java;

class VAriable
{
	int b=20;
	static int  c=30;
	
	void show()
	{
		int a=20;//local variable
		
	}
	
}
public class Variable_types 
{
	public static void main(String[] args) 
	{
		VAriable va=new VAriable();
		System.out.println(va.b);
		System.out.println(VAriable.c);
		
	}
}


