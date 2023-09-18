package com.Super;
class Animal
{
	String color="red";
}

class Petanimal extends Animal
{
	String color="white";
	void display()
	{
	System.out.println(color);
	System.out.println(super.color);
	
	}
	
	
	
}

public class reference_var 
{
	public static void main(String[] args)
	{
		new Petanimal().display();
		
		
	}

}
