package com.Static_keyword;

class Method {
	static int i = 10;

	static void display() {

		System.out.println("I AM RUNNING" + i);

	}

}

class Method1 extends Method {

	static void display() {

		System.out.println("AM RUNNING:" + i);
	}

}

public class Static_method {
	public static void main(String[] args) {
		Method1.display();

	}

}
