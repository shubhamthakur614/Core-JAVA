//method overloading by changing the argument
//if a class having multiple method of having same name but different argument known as 
//method overloading
package com.Polymorphism;
class Overld
{
	int i,j,k;
	void add(int i,int j)
	{
		this.i=i;
		this.j=j;
		System.out.println(i+j);
		
	}
	void add(int i,int j,int k)
	{
		this.i=i;
		this.j=j;
		this.j=j;
		System.out.println(i+j+k);
	}
}

public class Method_overloading 
{
	public static void main(String[] args) {
		
	
	Overld ov=new Overld();
	ov.add(5,4);
	ov.add(5, 4,3);
	
	}
	
		
	}


