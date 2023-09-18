package com.Multithreding;

class Sthread extends Thread {
	static Thread mt;// creating the main thread variable for main

	public void run() {
		try {
			mt.join(8000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println("CHILD THREAD WAITING # ");
		}
	}

}

public class MAIN_THREAD_Join {
	public static void main(String[] args) throws Exception {

		Sthread st = new Sthread();
		st.start();
		Sthread.mt=Thread.currentThread();//we will access the static variable by class name only
		// st.join(); dead lock condition

		for (int i = 1; i <= 10; i++) {
			System.out.println("MAIN THREAD Executing @");

			Thread.sleep(1000);

		}

	}

}
