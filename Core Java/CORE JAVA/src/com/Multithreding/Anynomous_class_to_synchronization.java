package com.Multithreding;

class Any
{
	public synchronized void display(int x)
	{
		for(int i=1;i<10;i++)
		{
			System.out.println(x*i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class Anynomous_class_to_synchronization 
{
	public static void main(String[] args) 
	{
		Any a=new Any();
		Thread t=new Thread()
		{
			public void run()
			{
				a.display(10);
			}
		};
		
		Thread t2=new Thread()
				{
			    public void run()
			    {
			    	a.display(20);
			    }
				};
		t.start();
		t2.start();
	}

}
