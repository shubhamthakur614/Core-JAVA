package com.Final;
final class Fclass
{
	int a=20;
	void method()
	{
		a=40;
		System.out.println("FINAL CLASS:"+a);
	}
}
//if we make class final you can not extends that class
//so if your class is final by default method is also final
//But not variable variable can be override
//if you make class final then you are missing the oops inheritance and polymorphism concept by declaring class as final
//the advantage of final class or method is if your method is final then no one can modify so you get security
//if your class is final no one is allowed to override so get uniqueness

public class Final_class 
{
	public static void main(String[] args) 
	{
		Fclass ff=new Fclass();
		ff.method();
		
	}

}
