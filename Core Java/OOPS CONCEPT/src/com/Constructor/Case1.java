package com.Constructor;

public class Case1 
{
	public Case1()
	{
//	this(10);//if we unblock recursion expression error occur
	}

	public Case1(int x)
	{
		this();
	}
	public static void main(String[] args)
	{
		System.out.println("hello");//without creating object constructor error occur
		
	}
}
