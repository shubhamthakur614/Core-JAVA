package com.Multithreding;

class myThread implements Runnable
{
	public void run()
	{
		for(int i=1;i<10;i++)
		{
			System.out.println("CHILD THREAD: "+Thread.currentThread().getName());
		}
	}
}

public class Check_which_thread_exe_prog 
{
	public static void main(String[] args) 
	{
		myThread t=new myThread();
		Thread tt=new Thread(t);
		tt.start();
		
		for(int i=1;i<10;i++)
		{
			System.out.println("Main THREAD :"+Thread.currentThread().getName());
		}
		
		
		
	}

}
