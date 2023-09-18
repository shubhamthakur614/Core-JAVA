package com.Variable;

//If the value of variable varries from object to object that we called instance variable.

public class Instance_variable 
{
	int a=10;//instance variable outside method inside class directly.

	public static void main(String[] args)
	{
//		System.out.println(a);//can not access the non static variable inside static method
		//if you want to access use reference variable
		Instance_variable v=new Instance_variable();
		System.out.println(v.a);//here you get the o/p 10
		v.m1();
		
		
		
		
		
	}
	public  void m1()
	{
		System.out.println(a);//here you can directly access becz method is non static so instance variable can access here
	}
}
