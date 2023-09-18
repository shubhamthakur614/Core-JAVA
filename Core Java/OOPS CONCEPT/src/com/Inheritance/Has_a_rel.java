package com.Inheritance;

import java.util.Scanner;

class Employee
{
	int id;
	String name;
	Address address;
	
	Employee(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.state+" "+address.city+" "+address.pincode);
		
	}
	
}


public class Has_a_rel 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	    System.out.println("ENTER THE DETAILS OF EMPLOYEE ID,NAME,STATE,City,Pincode");
	    int a=s.nextInt();
	    String n=s.next();
	    String st=s.next();
	    String ct=s.next();
	    int p=s.nextInt();
		Address address1=new Address(st,ct,p);
		//Address address2=new Address(st,ct,p);
		Employee e1=new Employee(a,n,address1);
		//Employee e2=new Employee(a,n,address2);
		e1.display();
		s.close();
		
		
		
		
		
		
	}

}
