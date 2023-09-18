package com.Multithreding;
// Yield it will passes the current executing method and
//giving chance to waiting method of same priority.

class AB implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Multithreading "+ i);
			Thread.yield();
		}
	}
	
}
public class Yield_method 
{
	public static void main(String[] args) 
	{
		AB a=new AB();
		Thread t=new Thread(a);
		t.setPriority(10);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main method is Executing "+ i);
		}

	}
	

}
