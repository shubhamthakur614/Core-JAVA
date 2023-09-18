package com.Multithreding;

class daemon extends Thread
{
	public void run()
	{
		for(int i=1;i<10;i++)
		{
			System.out.println("Child thread Is Executing");
			try
			{
				Thread.sleep(200);
			}
			catch(Exception e) {};
		}
		
	}
	
}
public class Deamon2 
{
	public static void main(String[] args)
	{
		daemon dm=new daemon();
		System.out.println(dm.isDaemon());
		dm.setDaemon(true);
		System.out.println(dm.isDaemon());
		dm.start();
		System.out.println("MAIN  thread is end HERE");
		
	}

}
