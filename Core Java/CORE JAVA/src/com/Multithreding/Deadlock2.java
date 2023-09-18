package com.Multithreding;

class A
{
	public synchronized void d1(B b)
	{
		System.out.println("Thread 1 start executing  the d1()");
		
		try
		{
			Thread.sleep(2000);
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("thread 1 trying to calling the B's class last ()");
		b.last();
	}
	
	public synchronized void last()
	{
		System.out.println("inside the A's Last()");
	}
	
}

class B
{
	public synchronized void d2(A a)
	{
		System.out.println("Thread 2 start executing the d2()");
		try
		{
			Thread.sleep(2000);
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("thread 1 trying to calling the B's class last ()");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("inside the B's Last()");
	}
	
	
}

public class Deadlock2 extends Thread
{
	A a=new A();
	B b=new B();
	
	public void m1()
	{
		this.start();
	    a.d1(b);//this line is executed by main thread
	}
	
	public void run()
	{
		b.d2(a);//this line is executed by child thread
	}
	
	
	public static void main(String[] args) 
	{
		Deadlock2 t=new Deadlock2();
		t.m1();//we are doing like this becz we can not call the instance variable to static method
		
	}

}
