package com.This;

class Parent
{
	String s="PARENT CLASS";
	
}

class Child extends Parent
{
	String s="CHILD CLASS";
	
	public void m1()
	{
		//if you are calling directly then by default this.s will be called by jvm for current reference variable
		System.out.println("IMPLICITLY CALLS THE CURRENT CLASS VARIABLES :"+s);
		//if you want to use explicitly u can use (this.s)
		
		//if current class don't have reference variable then by default super class variable is referred.
		//if you explicitly want to use parent class reference variable then you have to use (super.s)
		System.out.println("EXPLICITLY CALLING PARENT CLASS BY SUPER KEYWORD: "+super.s);
	}
}

public class This_demo extends Parent
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.m1();
		
	}
	

}
