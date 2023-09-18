package com.Multithreding;

//how a sleeping thread or waiting thread is getting interrupt by the interrupt method
//here main method will interrupting the child method 


class Inrterupt extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<10;i++)
			{
				System.out.println(" I AM LAZY THREAD");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
		System.out.println("I am Interrupted by main method");
		}
	}
}

public class Interrupt_method 
{
	public static void main(String[] args) 
	{
		Inrterupt it=new Inrterupt();
		it.start();
		
		it.interrupt();
		System.out.println("END OF MAIN THREAD");
		
	}

}
