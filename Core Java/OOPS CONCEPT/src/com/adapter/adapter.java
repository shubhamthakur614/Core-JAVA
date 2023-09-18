package com.adapter;

interface i1
{
	//an interface can contain any no of method
	public void m1();
	public void m2();
	public void m3();
	public void m4();
	public void m5();
	public void m6();
	public void m7();
	public void m8();
	public void m9();
	public void m10();
	
	
}

//the class can implementing that interface has to provide the implementation to this methods
abstract class i2 implements i1
{
	//it is a adapter class which provide the dummy implementation or empty implementation
	public void m1() {}
    public void m2(){}
	public void m3(){}
	public void m4(){}
	public void m5(){}
	public void m6(){}
	public void m7(){}
	public void m8(){}
	public void m9(){}
	public void m10(){}
	
}
//the use of adapter class is the class which extending this adapter class no need to provide 
//implementation for all method based on
//requirement provide implementation to that method only.

public class adapter extends i2
{
	
	
		
		public void m4()
		{
			System.out.println("PROVIDING IMPLEMETATION FOR method By OVERRIDING METHOD m4:");
		}
		
		public void m10()
		{
			System.out.println("PROVIDING IMPLEMETATION FOR method By OVERRIDING METHOD m10:");
		}
		
		public static void main(String[] args) 
		{
			
			adapter a=new adapter();
			a.m4();
			a.m10();
		}
		
	

}
