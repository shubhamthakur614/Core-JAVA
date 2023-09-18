package com.Multithreding;
class myThread5 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("child thread:");
		}
		
	}
}

public class _2Implemrnting_runnable_interface2 
{
	public static void main(String[] args) 
	{
		
		myThread5 t=new myThread5();
		Thread t1=new Thread(t);
	   t1.start();
	   for(int i=0;i<10;i++)
		{
		System.out.println("Main thread:");
		}
		
	}

}
