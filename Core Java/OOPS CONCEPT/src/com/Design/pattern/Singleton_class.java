package com.Design.pattern;

class Test12
{
	private static Test12 t=new Test12();
	
	public static Test12 getTest()
	{
		System.out.println("you using singlonton class object as reference:");
		return t;
	}
	
}

public class Singleton_class 
{
	public static void main(String[] args) {
		
	
	Test12 t1=Test12.getTest();
	}
	
	

}
