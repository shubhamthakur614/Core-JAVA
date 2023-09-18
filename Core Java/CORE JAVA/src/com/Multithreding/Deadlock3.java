package com.Multithreding;

public class Deadlock3 {
	String s1 = "Shubham";
	String s2 = "Thakur";

	Thread t1 = new Thread() 
	{
		public void run() {
			while (true) {
				synchronized (s1) {
					System.out.println(Thread.currentThread().getName()+" Locked "+s1);
					try {
						Thread.sleep(1000);

					     } 
					catch (InterruptedException e) 
							{
								      e.printStackTrace();
							}

					synchronized (s2) {
						System.out.println(Thread.currentThread().getName()+" Locked "+s2);
						//System.out.println(s1 + s2);
					}
				}
			}
		}
	};

	Thread t2 = new Thread() {
		public void run() {
			while (true) {
				synchronized (s2) {
					System.out.println(Thread.currentThread().getName()+" Locked "+s2);

					synchronized (s1) {
						System.out.println(Thread.currentThread().getName()+" Locked "+s1);
//						System.out.println(s1 + s2);
					}
				}
			}
		}
	};
	
	public static void main(String[] args)
	{
		Deadlock3 d=new Deadlock3();
		d.t1.start();
		d.t2.start();
		
	}

}
