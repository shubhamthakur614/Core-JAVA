package com.Multithreding;
class Th extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("THIS IS CHILD THREAD!!!!!!!!!!!");
			//child thread is responsible to execute this thread run method
		}
		
	}
	
}

public class _1Extending_threadClass1 
{
	public static void main(String[] args) //here we have main thread
	{
		Th t=new Th();//main thread create the object of child thread class
		t.start();//if  we do directly run () method we get o/p by main method not by thread class
		//main thread starting the child thread class
		//here we have two thread
		//main thread execute rest of code where child thread will responsible to execute the run method 
		//here we get combined output based on thread scheduler
		for(int i=1;i<=10;i++)
		{
			System.out.println("MAIN THREAD!!!!!!!!!!!!!!!!!");//main thread is responsible to execute this thread
		}
		
		
	}

}
