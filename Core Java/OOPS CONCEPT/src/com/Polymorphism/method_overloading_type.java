package com.Polymorphism;

class Animal1
{
	
}
class Monkey extends Animal1
{
	
}

class Test
{
	public void m1(Animal1 a)
	{
		System.out.println("ANIMAL IS EXECUTE:");
	}
	public void m1(Monkey m)
	{
		System.out.println("MONKEY IS EXECUTE: ");
	}
}

public class method_overloading_type 
{
	
	public static void main(String[] args)
	{
		Test t=new Test();
		Animal1 a=new Animal1();
		t.m1(a);
		Monkey m=new Monkey();
		t.m1(m);
	}
	

}
