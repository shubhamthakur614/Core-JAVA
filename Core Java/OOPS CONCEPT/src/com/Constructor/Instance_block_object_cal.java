package com.Constructor;

//write a program to calculate the no of object created by you using instance block concept

//When ever object is create the instance block is executes
public class Instance_block_object_cal {
	static int count = 0;
	static int count1=0;

	{
		System.out.println("Instance block execute before the constructor");
		count++;

	}
	static
	{
		count1++;
	}
	

	Instance_block_object_cal() {
		System.out.println("CONSTRUCTOR WITHOUT ARGUMENT ");
	}

	Instance_block_object_cal(int a) {
		System.out.println("CONSTRUCTOR WITH INT ARGUMENT ");
	}

	Instance_block_object_cal(double d) {
		System.out.println("CONSTRUCTOR WITH THE DOUBLE ARGUMENT");
	}

	public static void main(String[] args) {
		Instance_block_object_cal o = new Instance_block_object_cal();
		Instance_block_object_cal o1 = new Instance_block_object_cal(10);
		Instance_block_object_cal o2 = new Instance_block_object_cal(10.5);

		System.out.println("Program to calculate the no of object created by the instance block:" + count);
		System.out.println("Program to calculate the no of object created by the Static block:" + count1);
		

	}

}
