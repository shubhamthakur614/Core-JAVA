package com.Constructor;

class Test2 {
	// using 2 Way create the object When ever required
	private Test2()
	{
		//private constructor
	}

	private static Test2 t = null;

	public static Test2 getMethod() {
		if (t == null) {
			t = new Test2();
		}
		return t;
	}

}

public class Singleton1 {
	public static void main(String[] args) {
      Test2 t1=Test2.getMethod();
      System.out.println(t1.hashCode());
      Test2 t2=Test2.getMethod();
      System.out.println(t1.hashCode());
      
	}

}
