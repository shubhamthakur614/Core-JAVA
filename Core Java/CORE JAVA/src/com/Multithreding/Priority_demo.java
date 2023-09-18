package com.Multithreding;

class myPriority extends Thread
{
	public void run()
	{
		
	}
}

public class Priority_demo 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		myPriority p=new myPriority();
		p.start();
	     System.out.println(p.getPriority());
		
		
		
	}

}
