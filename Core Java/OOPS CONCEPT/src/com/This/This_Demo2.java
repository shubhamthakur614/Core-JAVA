package com.This;	
	//This keyword is used to remove the ambiguty between the instance variable and the method or constructor argument.
class demo1
{
	int id;
	String name;
	public void m1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return "ID:"+id+" NAME:"+name;
	}
}
public class This_Demo2 
{
	public static void main(String[] args)
	{
		demo1 d=new demo1();
		demo1 d1=new demo1();
		d.m1(121, "SHUBHAM");
		d1.m1(122, "VIRAJ");
		System.out.println(d);
		System.out.println(d1);
	}

}
