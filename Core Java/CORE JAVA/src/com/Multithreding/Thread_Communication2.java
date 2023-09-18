package com.Multithreding;

class Bank {
	int amount = 10000;

	synchronized public void withdraw(int amount) {
		System.out.println("GOing to Withdraw ");
		if (this.amount < amount) {
			System.out.println("You have only " + this.amount + " in your bank");
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Waiting for deposite!!!!!");
			System.out.println("Waiting for notification ");
			System.out.println("Getting notification going for withdraw again");
			this.amount -= amount;
			System.out.println(amount + " withdraw sucessfully");
			System.out.println("Remaing amount is: " + this.amount);

		}

	}

	synchronized public void deposite(int amount) {
		System.out.println("Going to deposite the amount");
		System.out.println("Currently you have only " + this.amount);
		this.amount += amount;
		System.out.println("The new updated amount is :" + this.amount);
		System.out.println("Going to notify the waiting method");
		try {
//			notifyAll();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class Thread_Communication2 {
	public static void main(String[] args) {
		Bank b = new Bank();
		Thread t = new Thread() 
		{
			public void run() {
				b.withdraw(14500);
			}
		};
		Thread t1 = new Thread() {
			public void run() {
				b.deposite(7000);
			}
		};
		t.start();
		t1.start();

	}
}
