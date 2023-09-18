package com.Final;

class instance
{
	final int x;
	//you can provide the value to final instance variable by at declaration time
	//by instance block
	// inside constructor before constructor compilation
	
	//this is instance block execute before constructor
//	{
//		x=10;
//	}
	
	//this is constructor
	
	public instance()
	{
		
  	x=10;
  	System.out.println(x);
      
	}
}

public class Final_instance_varible 
{
	public static void main(String[] args)
	{
		
	
	instance i=new instance();
	
	
	}
	
	
	

}
