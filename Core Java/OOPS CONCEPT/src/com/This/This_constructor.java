package com.This;
//this() is used to call another constructor of same class that we called as constructor chaining
class demo3
{
	
	public demo3()
	{
		this(25d);
		System.out.println("Without Argument: ");
	}
	public demo3(int i)
	{
		System.out.println("Integer value: ");
	}
	
	public demo3(float f)
	{
		this(10);
		System.out.println("Floating value: ");
	}
	public demo3(double d)
	{
		this(12.4f);
		System.out.println("Double value ");
	}
	
}

public class This_constructor 
{
	public static void main(String[] args) 
	{
		demo3 d=new demo3();
		
		
		
	}

}
