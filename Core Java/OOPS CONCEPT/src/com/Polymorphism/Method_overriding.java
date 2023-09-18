/*Why can we not override static method?
It is because the static method is bound with class whereas instance method 
is bound with an object. Static belongs to the class area, and an instance belongs 
to the heap area.
 * 
 */

//if a subclass having same method of parent class then it will called method overriding
package com.Polymorphism;

//Java Program to illustrate the use of Java Method Overriding  
//Creating a parent class.  
class Vehicle {
	// defining a method
	void run() {
		System.out.println("Vehicle is running");
	}
}

// Creating a child class
class Bike2 extends Vehicle {
	// defining the same method as in the parent class
	void run() {
		super.run();//to call super class method
		System.out.println("Bike is running safely");
		
	}
}

public class Method_overriding {
	public static void main(String[] args) {
		Bike2 obj = new Bike2();// creating object
		obj.run();// calling method
		

	}
}
