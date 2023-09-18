package com.Access_modi;

//protected member accesses anywhere in same package
//but outside package at child class only by extending this protected member class
//and only access the method or variable by child only not by parent class. 
public class A 
{
	protected void m1()
	{
		System.out.println("DONT UNDERRESTIMATE ME!!!!!!!!!!");
	}

}

class B extends A
{

	public static void main(String[] args) 
	{
		A a=new A();//parent class object 
		a.m1();
		B b=new B();
		//child class object so that by inheritance parent method is available
		b.m1();
		//parent class reference to hold the child object
		A a1=new B();
		a1.m1();
		//there is another pkg 2 which has c class accessing a class method
		
	}	
}
