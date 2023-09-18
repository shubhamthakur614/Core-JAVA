package com.Inheritance;

class Bank
{
	private String name;
	Bank(String name)
	{
		this.name=name;
		
	}
	public String getBankName()
	{
		return this.name;
	}
	
	
}

class Emp
{
	private String name;
	Emp(String name)
	{
		this.name=name;
	}
	
	public String getEmpName() {
		return this.name;
	}
	
}
//association of two classes in main method
public class Proper_association_demo
{
	public static void main(String[] args) 
	{
		Bank b=new Bank("Axis");
		
		Emp e=new Emp("Shubham");
		System.out.println(e.getEmpName()+" is Employee of the bank "+b.getBankName());
		
		
		
	}

}
