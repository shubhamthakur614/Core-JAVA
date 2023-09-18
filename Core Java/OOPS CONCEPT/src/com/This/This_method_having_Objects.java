package com.This;
class demo4
{
  void m1(demo4 d)
	{
		System.out.println("THIS IS METHOD INVOKED");
	}
	 void m2()
	{
		m1(this);
	}
}

public class This_method_having_Objects 
{
	public static void main(String[] args) {
		
	
	demo4 d=new demo4();
	d.m2();
	
	}
}
