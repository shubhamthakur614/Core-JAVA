package com.Inheritance;
class Parent
{
	
	void run()
	{
		System.out.println("THIS IS PARENT CLASS:");
	}
	
	
}
class Child extends Parent
{
	void runaway()
	{
		System.out.println("THIS IS CHILD CLASS:");
		
	}
	
}

public class Inheritance_demo
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.run();
		c.runaway();	
	}

}
