package com.Polymorphism;

class Parent11
{
	public void m1(int... x)
	{
		System.out.println("PARENT METHOD: ");
	}
}

class Child1 extends Parent11
{
	public void m1(int x)
	{
		System.out.println("CHILD METHOD:");
	}
}
public class varargs_overriding 
{
	public static void main(String[] args) 
	{
		Parent11 p =new Child1();//upcasting
		p.m1(5);//we get the output as a parent method becz we using method overloading not overriding in case of overloading 
		//compiler will give reference to reference variable of parent class
		
		//if we do overriding by doing child method also var args then we get o/p as child method
		
	}

}
