package com.Polymorphism;
class Animal
{
	void display()
	{
		System.out.println("SAVE THE ANIMAL SAVE THE WORLD:");
	}
	
}
class Dog extends Animal
{
	void display()
	{
		System.out.println("DOG IS AN ANIMAL:");
	}
}

public class Runtime_poly
{
	public static void main(String[] args) 
	{
		Animal a=new Dog();
		a.display();//we also call dynamic binding
		//but in case of variable it not going to show child data it show parent data only
		
	}

}
