package com.Multithreding;

class ThreadB extends Thread
{
	int total=0;
	public void run()
	{
		
		synchronized(this)
		{
			System.out.println("child method calculating the sum for main method by "
					+ "aquiring lock on method");
			
			for(int i=1;i<=100;i++)
			{
				total=total+i;
			}
			System.out.println("child method giving notification to wait method or main method");
			this.notify();
		}
			
		}
		
	}

public class THREAD_COMMUNICATION1 
{
	public static void main(String[] args) throws Exception
	{
		ThreadB b=new ThreadB();
		b.start();
		
		synchronized(b)
		{
			System.out.println("Main method calling  the Wait() for updation and get a lock");
			b.wait();
			
			System.out.println("main method get notification");
			System.out.println(b.total);
		}
		
		
	}

}



