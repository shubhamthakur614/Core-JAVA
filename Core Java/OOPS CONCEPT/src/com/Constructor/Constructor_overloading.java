package com.Constructor;

class Constructors
{
	
	public Constructors()
	{
		this(10);
		System.out.println("No ARGUMENT CONSTRUCTOR");
	}
	
	public Constructors(int x)
	{
		this(10.5);
		System.out.println("INTEGER ARGUMENT CONSTRUCTOR");
	}
	public Constructors(double d)
	{
		System.out.println("DOUBLE TYPE ARGUMENT CONSTRUCTOR");
	}
}

public class Constructor_overloading 
{
	public static void main(String[] args) 
	{
		Constructors c=new Constructors();
		Constructors c1=new Constructors(10);
		Constructors c2=new Constructors(20.5);
		
	}

}
