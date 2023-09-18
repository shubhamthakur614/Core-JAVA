package com.Final;
class Fmethod
{
	final void method()
	{
		System.out.println("CAR IS MOVING");
	}
	
}
//if you make any method as final than you can not override this method
class Fmethod1 extends Fmethod
{
//	void method()
//	{
//		System.out.println("Car can run");
//	}
}

public class Final_method 
{
	public static void main(String[] args) 
	{
		Fmethod1 f=new Fmethod1();
		f.method();
		
	}

}
