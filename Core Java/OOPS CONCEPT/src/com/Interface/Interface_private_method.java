package com.Interface;


//in java 9 you can create private method inside interface

interface private_method
{
	
	default void m()
	{
		System.out.println("Default helping to call private method outside class");
		this.m1();
	}
	private void m1()
	{
		System.out.println("THIS IS PRIVATE METHOD  CAN CALL OUTSIDE THE CLASS BY ANOTHER METHOD");
	}
}
public class Interface_private_method implements private_method
{
	public static void main(String[] args) 
	{
		
		Interface_private_method i=new Interface_private_method();
		i.m();
	}
	

}
