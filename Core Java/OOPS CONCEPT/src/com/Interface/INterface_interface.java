package com.Interface;

interface p1
{
	void show();
	
}
interface p2 extends p1
{
	void print();
	
}
class child implements p1,p2
{
	public void show()
	{
		System.out.println("hello");
	}
	public void print()
	{
		System.out.println("shubham");
	}
	
}

public class INterface_interface 
{
	public static void main(String[] args) 
	{
		child c=new child();
		c.print();
		c.show();
		
	}

}
