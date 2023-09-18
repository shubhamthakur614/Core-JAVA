package com.Multithreding;

class myThread6 extends Thread
{
	public void run()//jvm only take the run method with no-argument
	{
		System.out.println("default run method");
		
	}
	public void run(int i)//if you want to run then explicitly run that method
	{
		System.out.println("Explicitly running the run method with argument");
		
	}
}

public class Run_method_overloading 
{
	public static void main(String[] args) 
	{
		myThread6 t=new myThread6();
		t.start();
		t.start();
		t.run(10);//we have to explicitly call the run method
		
		
	}

}
