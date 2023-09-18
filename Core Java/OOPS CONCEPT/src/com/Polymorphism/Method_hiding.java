package com.Polymorphism;

/*
 * In case of method hiding method resolution taking care by JVM 
 * through compiler only bases on reference variable not at runtime
 *  but in normal override method resolution taking care by jvm based
 *  on the run time only
 * 
 * 
 * 
 */

class Parent10
{
	public static void m1()
	{
		System.out.println("PARENT METHOD:Becz of method Hiding");
	}
}

class Child extends Parent10
{
	public static void m1()
	{
		System.out.println("Child METHOD:");
	}
	
}

public class Method_hiding 
{
	public static void main(String[] args) 
	{
		Parent10 p=new Child();//up casting
		p.m1();//parent value becz method hiding and 
//		method resolution taking care by compiler bases on object refrence
		
		
	}

}
