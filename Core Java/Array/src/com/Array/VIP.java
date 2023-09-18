package com.Array;

// how we pass two values from one method to any method in java without createing new array;
public class VIP 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		A<Integer> aa=getvalue(a,b);
		System.out.println("value of A is: "+aa.getA());
		System.out.println("Value if B is: "+aa.getB());
		
	}
	
	public static A<Integer> getvalue(int a,int b)
	{
		a++;
		b++;
		return new A<Integer>(a,b);
	}
}

class A<T>
{
	private final T a;
	private final T b;
	public T getA() {
		return a;
	}
	public T getB() {
		return b;
	}
	public A(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}

}
