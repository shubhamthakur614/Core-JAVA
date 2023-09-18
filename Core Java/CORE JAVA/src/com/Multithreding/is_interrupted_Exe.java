package com.Multithreding;

public class is_interrupted_Exe extends Thread
{
//	if thread interrupted make it true and then by interrupted method make it false again
//	so that execution can be continue even we get interruption
	
	public void run()
	{
//		System.out.println("A "+Thread.interrupted());//make true status to false
		System.out.println("B "+Thread.currentThread().isInterrupted());
		try
		{
			for(int i=1;i<5;i++)
			{
				System.out.println(i);
				Thread.sleep(500);
//				System.out.println("A "+Thread.interrupted());
				System.out.println("B "+Thread.currentThread().isInterrupted());
			}
			
		}
		catch(Exception e)
		{
			System.out.println("THREAD INTERRUPTED "+e);
		}
	}
	public static void main(String[] args) 
	{
		is_interrupted_Exe test=new is_interrupted_Exe();
		test.start();
		test.interrupt();
		
		
	}

}
