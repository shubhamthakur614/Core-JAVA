package com.This;

//you can invoked the another method from other method of same class using this keyword

class demo2
{
	public void m1()
	{
		System.out.println("THIS IS M1 METHOD:");
	}
	public void m2()
	{
		//if you are not using this then JVM by default give the this 
		this.m1();
		System.out.println("THIS IS M2 METHOD: ");
		
	}

}
public class This_Demo3 
{
	public static void main(String[] args) 
	{
		demo2 d=new demo2();
		d.m2();
		
	}
}


	
		
	


