package com.Multithreding;
//mt.join();//it means main thread want to wait until completion of 
//child thread and main thread go to waiting stage
///it throw IE exception which is checked Exception

class ABC implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Multithreading "+ i);
			try
			{
				Thread.sleep(1000);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
}

public class JOin_thread
{
	public static void main(String[] args)
	{
		ABC a=new ABC();
		Thread t=new Thread(a);
		t.setPriority(10);
		t.start();
		try
		{
			t.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("Main method is Executing "+ i);
		}
		
	}


}
