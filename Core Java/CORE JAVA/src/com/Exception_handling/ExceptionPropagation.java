package com.Exception_handling;

import java.io.IOException;

//checked exception is not propagated through method using throw keyword

public class ExceptionPropagation {
	public void m1() throws IOException {

		// the caller method handle still get error we have to either handle by try
		// catch
//		or use throws keyword on same method caller through checked exception propagation 
//		not handle
		throw new IOException("This is file not found exception");

	}

	public void m2() throws IOException {
		this.m1();
	}

	public void m3() throws IOException {
		this.m2();
	}

	public static void main(String[] args) {
		try {
			ExceptionPropagation ee = new ExceptionPropagation();
			ee.m2();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
