package com.Multithreding;

class mythread8 extends Thread
{
	public void start()//if you override the start() then thread is not created and we dont get run method
	{
//		super(start());//if you do like this then thread is created an get the proper o/p
		System.out.println("start method overriding");
	}
	public void run()
	{
		System.out.println("RUN METHOD");
	}
}

public class Start_method_overriding
{
	public static void main(String[] args)
	{
		mythread8 t=new mythread8();
		t.start();
		t.start();
		
		
		
	}

}
