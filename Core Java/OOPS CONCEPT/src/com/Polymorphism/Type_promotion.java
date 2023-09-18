package com.Polymorphism;

class AAA {
//	public void add(int a, double b) 
//	{
//		System.out.println("one");//type promotion is going to happen int type promoted to double
//	}

//	public void add(int a, int b) 
//	{
//		System.out.println("two");//if we have int then no need to do promotion priority goes to int 
//
//	}

	public void add(double a, double b) {
		System.out.println("three");
	}
}

public class Type_promotion {
	public static void main(String[] args) 
	{
		AAA a=new AAA();
		a.add(10, 10);//one int and one double

	}

}
