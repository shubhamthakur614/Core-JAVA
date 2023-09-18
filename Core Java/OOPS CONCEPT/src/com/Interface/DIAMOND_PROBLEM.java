package com.Interface;
//IF A SUPER INTERFACE HAVING A METHOD WHICH IS OVERRIDE IN THE TWO INTERFACE 
//THEN THERE IS A AMBIGUTION THAT WE CALLED DIAMOND
//PROBLEM TO SOLVE THIS PROBLEM YOU HAVE TO OVERRIDE THE THE SAME METHOD 
//IN MAIN CLASS GIVING THE NAME OF ANY ONE INTERFACE
interface A//super interface
{
	default void m()
	{
		System.out.println("SAME METHOD IN A");
	}
}
interface B extends A//sub interface
{
	default void m()
	{
		System.out.println("SAME METHOD IN A");
	}
}
interface C extends A //sub interface
{
	default void m()
	{
		System.out.println("SAME METHOD IN A");
	}
}

public class DIAMOND_PROBLEM implements A,B,C
{
	@Override
	public void m() {
		// TODO Auto-generated method stub
		B.super.m();
	}
	public static void main(String[] args) 
	{
		new DIAMOND_PROBLEM().m();
		
	}

	

}
