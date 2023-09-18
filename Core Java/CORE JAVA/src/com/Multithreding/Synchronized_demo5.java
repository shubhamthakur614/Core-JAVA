package com.Multithreding;

class Table
{
	synchronized public void printtable(int x)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i*x);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class mytable5 extends Thread
{
	Table t;
	int x;
	
	public mytable5(Table t,int x)
	{
		this.x=x;
		this.t=t;
	}
	
	public void run()
	{
		t.printtable(x);
		
	}
	
}

class mytable10 extends Thread
{
	Table t;
	int x;
	public mytable10(Table t,int x)
	{
		this.t=t;
		this.x=x;
		
	}
	
	public void run()
	{
		t.printtable(x);
	}
}

public class Synchronized_demo5
{
	public static void main(String[] args)
	{
		Table t=new Table();
		mytable5 mf=new mytable5(t,5);
		mf.start();
		
		mytable10 mt=new mytable10(t,10);
		mt.start();
		
	}

}
