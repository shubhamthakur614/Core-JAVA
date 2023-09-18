package com.Design.pattern;

class Test13
{
	private Test13()
	{
		
	}
	private static Test13 t=null;
	
	public static  Test13 gettest()
	{
		if(t==null)
		{
			t=new Test13();
		}
		System.out.println("YOU ARE USING SINGLETON CLASS OBJECT");
		return t;
	}
	
}

public class Singleton_class_approach2
{
	public static void main(String[] args) 
	{
		Test13 t1=Test13.gettest();
		Test13 t2=Test13.gettest();
		Test13 t3=Test13.gettest();
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
	}

}
