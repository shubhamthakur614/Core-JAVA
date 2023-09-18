package com.Interface;

interface Inter
{
	void display();
}
class Face implements Inter
{
	public void display()
	{
		System.out.println("THIS IS INTERFACE EXAMPLE:");
		
	}
}

public class Interface_demo 
{
	public static void main(String[] args) 
	{
		Inter i=new Face();//you can call like this also
		i.display();
		
	}

}
