package com.Polymorphism;
class Data_t
{
	public int add(int a,int b)
	{
		System.out.println(a+b);
		return 0;
	}
	float add(float a,float b)
	{
		System.out.println(a+b);
		return 0;
	}
}

public class Method_overloading_data 
{
	public static void main(String[] args) 
	{
		Data_t d=new Data_t();
		d.add(15,25 );
		d.add(15.5f,25.5f);
	}
}
