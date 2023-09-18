package com.Constructor;

public class ConstructorDemo 
{
	int rollno;
	String name;
	ConstructorDemo(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	
	public String toString()
	{
	   return "Rollno:"+rollno+ " Name:" +name;
	}

	
	public static void main(String[] args)
	{
		ConstructorDemo c=new ConstructorDemo(12, "SHUBHAM");
		System.out.println(c);
		
	}

}
