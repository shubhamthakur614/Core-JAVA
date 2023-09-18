package com.Constructor;
//For any java class if we are allowed to create only one object

//then that we called as singleton class
// EX:Runtime,BussinessDeligate,ServiceLocator,java.lang.Class
//
//If several people have same requirement then it is not recommended to 
//create a separate object for every requirement.
//same object can reuse when ever similar requirement due to that 
//memory utilization as well as performance improved

// There Are two way of creating Singleton class
//1) by crating object first
//2)when ever require create object to save the object memory

class Test1 {
//	 first way
	private Test1() {

	}

	private static Test1 t = new Test1();

	public static Test1 getMethod() {
		System.out.println("CREATE ONLY ONE OBJECT ");
		return t;
	}

}

public class Singleton {
	public static void main(String[] args) {
		Test1 t1 = Test1.getMethod();
		System.out.println(t1.hashCode());
		Test1 t2 = Test1.getMethod();
		System.out.println(t2.hashCode());
	}

}
