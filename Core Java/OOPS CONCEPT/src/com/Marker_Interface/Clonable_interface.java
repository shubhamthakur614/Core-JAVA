package com.Marker_Interface;


	//this interface dosent contain any method but by implementing this interface we can create object duplication
class A implements Cloneable
{
	int i;
	String name;
	
	public A(int i,String name)
	{
		this.i=i;
		this.name=name;
	}
	@Override
	protected Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
}

public class Clonable_interface 
{
	public static void main(String[] args) throws Exception
	{
		
	
	A a=new A(1,"SHUBHAM");
	A b=(A)a.clone();
	System.out.println("ORIGINAL METHOD:"+a.i+" "+a.name+" ");
	System.out.println("CLONE METHOD: "+b.i+" "+b.name+" ");
	
	}

}
