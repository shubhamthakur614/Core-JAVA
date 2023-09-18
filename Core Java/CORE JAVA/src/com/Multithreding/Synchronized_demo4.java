package com.Multithreding;

class Display10 {
	public synchronized void displayn() {
		for (int i = 1; i < 10; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public synchronized void displayc() {
		for (int i = 65; i < 75; i++) {
			System.out.print((char) i + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			;

		}
	}
}

class Mythread10 extends Thread {
	Display10 d;

	Mythread10(Display10 d) {
		this.d = d;
	}

	public void run() {
		d.displayn();
	}

}

class Mythread11 extends Thread {
	Display10 d;

	Mythread11(Display10 d) {
		this.d = d;
	}

	public void run() {
		d.displayc();
	}
}

public class Synchronized_demo4 {
	public static void main(String[] args) {
		Display10 d = new Display10();

		Mythread10 mt10 = new Mythread10(d);
		Mythread11 mt11 = new Mythread11(d);
		mt10.start();
		mt11.start();

	}

}
