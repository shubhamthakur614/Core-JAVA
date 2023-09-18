//a class can not be protected or private except nested class
// we have 12 access modifier in java
// public,default,final ,abstract,strictfp this are the outer level modifier
//private ,protected,static,synchronized,native,volatile,transient

package com.Access_modi;
class Abc
{
	private int a=100;
	private void display()
	{
		System.out.println("THIS IS PRIVATE ACCESS MODIFIER");
	}
}

public class Private_modi 
{
	public static void main(String[] args) 
	{
		Abc a=new Abc();
		//a.display();
		
				
		
	}

}
