package com.Exception_handling;

import java.io.*;

class ReadAndWrite {
	public void readMethod() throws FileNotFoundException {
		FileInputStream fin = new FileInputStream("c:/abc.txt");
	}

	void writeMethod() throws FileNotFoundException {

		String n = "this is demo";
		FileOutputStream fout = new FileOutputStream("d:/xyz.txt");

	}

}

public class Throws_details {
	public static void main(String[] args) {
		ReadAndWrite rw = new ReadAndWrite();
		try {
			rw.readMethod();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {

			rw.writeMethod();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("HELLO");

	}

}
