package com.Variable;

public class Static1 
{
	static int a=20;
	int b=30;
	
	public static void main(String[] args) 
	{
		Static1 s=new Static1();
		a=800;//static variable no need the variable reference
		s.b=750;//instance variable need reference variable
		System.out.println(a+" "+s.b+" ");
		Static1 s2=new Static1();
		System.out.println(s2.a+" "+s2.b+" ");
		
		
	}
	

}
