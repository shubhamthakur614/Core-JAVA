package com.Interface;

interface Client
{
	// only declare the method can not implements the method it forces the method to abstract and 
	//we can not create the object for abstract and interface;
	
	public abstract void m1();
	void m2();// by default the method are public abstract
}

abstract class Service implements Client//we can do this also
{
	public void m1()
	{
		
	}
}

public class Subservice extends Service
{
	public void m2()
	{
		
	}

}
