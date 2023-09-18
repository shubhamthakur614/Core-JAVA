package com.Multithreding;


// every thread in java have some name if it not 
//explicitly given then jvm provide the default name

class Myname extends Thread
{
	
}

public class GETTING_THREAD_NAME 
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		
		Myname mn=new Myname();
		System.out.println(mn.getName());
		
		Thread.currentThread().setName("SHUBHAM");
		System.out.println(Thread.currentThread().getName());
		
	
		
		
	}

}
