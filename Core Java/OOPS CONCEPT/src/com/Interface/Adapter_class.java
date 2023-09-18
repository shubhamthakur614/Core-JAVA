package com.Interface;



interface ServicesReq
{
	//all method by default public and abstract
	//all variable by default public final static
	void m1();
	public  abstract void m2();
	public void m3();
	void m4();
	//and so on upto 100;
	
}
public class Adapter_class implements ServicesReq
{
	//this adapter class provide empty implementation 
	public void m1() {};
	public void m2() {};
	public void m3() {};
	public void m4() {};
	//and so on for 100;

}

class Provider extends Adapter_class
{
	public void m3()
	{
		System.out.println("i will satisfy your requirement");
	}
	public static void main(String[] args)
	{
		Provider p=new Provider();
		p.m3();
		
	}
	
}







