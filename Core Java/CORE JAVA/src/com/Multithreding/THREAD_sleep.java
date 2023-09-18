package com.Multithreding;

class Sleep implements Runnable
{
	public void run()
	{
		for (int i=1;i<10;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("THREAD IS RUNNING @ "+i);
		}
		
	}
}

public class THREAD_sleep 
{
	public static void main(String[] args)
	{
		Sleep ss=new Sleep();
		Sleep ss1=new Sleep();
		Thread t=new Thread(ss);
		Thread t2=new Thread(ss1);
		t.start();
		t2.start();
		
		
		

	}

}
