package com.Multithreding;

// if you make any method is static then it is not belong the object of that method it belong to the class of that method so
// there is lock on class not in object 
//as we have separate object still we can not simultaneously access the method becz when one method get lock
//until it complete its execution the lock to class we can not access the method . 
class Display2 {
	public static synchronized void wish(String name) {
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

class MyTH1 extends Thread {
	Display2 d;
	String name;
	public MyTH1(Display2 d,String name)
	{
		this.d=d;
		this.name=name;
		
	}
	public void run()
	{
		d.wish(name);
	}
}

public class Synchronized_demo3 {
	public static void main(String[] args) {
		Display2 d = new Display2();
		Display2 d1 = new Display2();
		MyTH1 mt = new MyTH1(d, "SHUBHAM");
		MyTH1 mt1 = new MyTH1(d1, "KARTIK");
		mt.start();
		mt1.start();

	}

}




