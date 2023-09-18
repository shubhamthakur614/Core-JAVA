package com.Basic_Java;
class Test1
{
	int id;
	String name;
	void abc(int i,String n)
	{
		this.id=i;
		this.name=n;
		
	}
	public String toString()
	{
		return id+" "+name;
	}
	
}


public class String_toString 
{
	public static void main(String[] args) 
	{
		Test1 t=new Test1();
		t.abc(121, "SHUBHAM");
		System.out.println(t);
	}

}
