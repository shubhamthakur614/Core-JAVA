package com.Multithreding;

class Tables
{
	public void tablePrint(int x)
	{
		synchronized(this)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(x*i);
				try
				{
					Thread.sleep(1000);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		}
	}
}

class Table10 extends Thread
{
	Tables t;
	int x;
	 public  Table10(Tables t,int x)
	 {
		 this.t=t;
		 this.x=x;
	 }
	 public void run()
	 {
		 t.tablePrint(x);
	 }
}

class Table5 extends Thread
{
	Tables t;
	int x;
	 public Table5(Tables t,int x)
	 {
		 this.t=t;
		 this.x=x;
	 }
	 public void run()
	 {
		 t.tablePrint(x);
	 }
}
public class Synchronized_block2 
{
	public static void main(String[] args) 
	{
		Tables t=new Tables();
		Table10 t10=new Table10 (t,10);
		t10.start();
		Table5 t5=new Table5(t,5);
		t5.start();
		
		
		
		
	}
	

}
