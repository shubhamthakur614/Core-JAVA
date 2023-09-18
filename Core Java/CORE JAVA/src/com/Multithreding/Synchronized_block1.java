 package com.Multithreding;
 
 class Synchchronized
 {
		public void wish(String name) {

//		
//		1 lakh line code!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			System.out.println("1 lakh of code");
			System.out.println("1 lakh of code");
			System.out.println("1 lakh of code");

			synchronized (this) {
				for (int i = 1; i < 10; i++) {
					System.out.print("GOOD MORNIG :");

					try {
						Thread.sleep(2000);

					} catch (Exception e) 
					{
						System.out.println(e);
					}
						System.out.println(name);
					
				}
			}

		}
 }
 
 class Mt1 extends Thread
 {
	 Synchchronized sz;
	 String name;
	public Mt1(Synchchronized sz,String name)
	 {
		 this.sz=sz;
		 this.name=name;
	 }
	 
	public void run()
	{
		sz.wish(name);
		
	}
	 
 }

public class Synchronized_block1 
{
	public static void main(String[] args)
	{
		Synchchronized sz=new Synchchronized();
		Mt1 mt=new Mt1(sz,"shubham");
		Mt1 mt1=new Mt1(sz,"Viraj");
		mt.start();
		mt1.start();
		
		
	}

}
