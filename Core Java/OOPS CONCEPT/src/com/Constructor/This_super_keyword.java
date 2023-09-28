package com.Constructor;
class demo
{
	int x=10;
}

class Program extends demo
{
	int x=100;
	public void m1()
	{
		
		System.out.println(this.x);
		System.out.println(super.x);
	}
	
}

public class This_super_keyword 
{
	public static void main(String[] args) 
	{
		Program p=new Program();
		p.m1();
	
	}}


