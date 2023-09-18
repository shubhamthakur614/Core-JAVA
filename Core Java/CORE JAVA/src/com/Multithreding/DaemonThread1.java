package com.Multithreding;

public class DaemonThread1 
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		Thread t=new Thread();
		System.out.println(t.isDaemon());
		
		t.setDaemon(true);
		System.out.println(t.isDaemon());
		
	}

}
