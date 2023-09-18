package com.Multithreding;
class TT extends Thread
{
	public void run()
	{
		for(int i=1;i<10;i++)
		{
			System.out.println("THIS ONE GET FIRST PRIority becz of setting value 10");
		}
	}
}

public class Thread_PRIORITY
{
	public static void main(String[] args)
	{
		TT t=new TT();
		t.setPriority(10);
		t.start();
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println("MAIN THREAD GET SECOND PRIORTY @ ");
		}
		
		
	}

}
