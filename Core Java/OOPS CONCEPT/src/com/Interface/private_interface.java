package com.Interface;

interface Arithmetic {
	default void dummy(int i, int j) {
		add(i, j);

	}

	private void add(int i, int j) {
		System.out.println("addtion of two number: " + (i + j));
	}

}

class Subtraction implements Arithmetic 
{
	//by default this dummy method available as code reusablity of inheritance

}

public class private_interface {
	public static void main(String[] args) {
		Subtraction s = new Subtraction();
		s.dummy(10,20);

	}

}
