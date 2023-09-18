package method_reference;

import java.util.function.BiFunction;
//another best example with interface

@FunctionalInterface
interface Printable {
	void print(String msg);
}

public class instance_method {

	public void display(String msg) {
		msg = msg.toUpperCase();
		System.out.println(msg);
	}

	public int add(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {
		instance_method i = new instance_method();
		BiFunction<Integer, Integer, Integer> bi = i::add;
		System.out.println(bi.apply(10, 20));
		
		//how to use your own interface method to pass the value to instance method
		instance_method i2 = new instance_method();
		Printable p=i2::display;
		p.print("Hello Shubham");
		

	}

}
