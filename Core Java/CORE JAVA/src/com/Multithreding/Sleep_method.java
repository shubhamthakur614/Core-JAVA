package com.Multithreding;

class mysleep extends Thread {
	public void run() {
		try {

			for (int i = 1; i < 10; i++) {
				System.out.println("I AM LAZY THREAD!!!!");
				Thread.sleep(2000);

			}
		}

		catch (Exception e)

		{
			System.out.println("I AM INTERRUPTED BY MAIN THREAD");
		}

	}
}

public class Sleep_method {
	public static void main(String[] args) throws Exception {
		mysleep ms = new mysleep();
		ms.start();
		ms.interrupt();

		System.out.println("Main Thread!!!!!!!!");

	}

}
