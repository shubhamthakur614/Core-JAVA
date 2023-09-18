package com.Multithreding;

import java.util.LinkedList;

public class Producer_consumer_problem {
	public static void main(String[] args) throws InterruptedException {
		final PC pc = new PC();

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					pc.produce();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					pc.consume();
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		});

		// to start two thread
		t1.start();
		t2.start();

		// if t1 finishes before t2 then
		t1.join();
		t2.wait();

	}

	// this class can have two methods producer and consumer
	public static class PC // static inner class
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		int capacity = 2;// for producing the product in list for consumer

		public void produce() throws InterruptedException {
			int value = 0;
			while (true) {
				synchronized (this) {
					while (list.size() == capacity)
						wait();

					System.out.println("PRODUCER PRODUCE-" + value);

					// to add value to list
					list.add(value++);
					// give notification to consumer method

					notify();
					// wait to get result
					Thread.sleep(1000);

				}

			}

		}

		public void consume() throws InterruptedException {
			while (true) {
				synchronized (this) {
					while (list.size() == 0)
						wait();
					// to fetch data from list
					int val = list.removeFirst();
					System.out.println("CONSUMER CONSUMES-" + val);
					// give notification to Consumer
					notify();
					// wait
					Thread.sleep(1000);

				}
			}
		}

	}

}
