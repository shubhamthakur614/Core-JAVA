package com.Super;
//super keyword is also use for parent class invoked

class Animal1
{
	void show()
	{
		System.out.println("Eating the food");
	}
	
}

class Petani extends Animal1
{
	void show()
	{
		System.out.println("animals are eating the food");
	}
	void dog()
	{
		System.out.println("Dogs are barking");
	}
	
	void display()
	{
	
	dog();
	super.show();
	}
}
public class parent_class_method
{
	public static void main(String[] args) 
	{
		new Petani().display();
		
	}

}
