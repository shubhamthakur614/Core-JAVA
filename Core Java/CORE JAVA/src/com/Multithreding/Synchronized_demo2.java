package com.Multithreding;
//if there are two thread then they can not need to wait even they are synchronized because separate object

class Display1 {
	public synchronized void wish(String name) {
		for(int i=1;i<10;i++)
		{
			System.out.print("GOOD MORNING: ");
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(name);
		}

	}

}

class MyTH extends Thread {
	Display1 d;
	String name;
	public MyTH(Display1 d,String name)
	{
		this.d=d;
		this.name=name;
		
	}
	public void run()
	{
		d.wish(name);
	}
}

public class Synchronized_demo2 {
	public static void main(String[] args) {
		Display1 d = new Display1();
		Display1 d1 = new Display1();
		MyTH mt = new MyTH(d, "SHUBHAM");
		MyTH mt1 = new MyTH(d1, "KARTIK");
		mt.start();
		mt1.start();

	}

}
