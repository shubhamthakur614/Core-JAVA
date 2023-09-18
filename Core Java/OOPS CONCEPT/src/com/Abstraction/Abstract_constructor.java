package com.Abstraction;

abstract class Person
{
	String name;
	Float height;
	int weight;
	
	public Person(String name,float height,int weight)
	{
		this.name=name;
		this.height=height;
		this.weight=weight;
		
	}

}

class Student extends Person
{
	int rollno;
	public Student(String name, float height, int weight,int rollno) 
	{
		super(name, height, weight);
		this.rollno=rollno;
		
	}	
	
	public void show()
	{
		System.out.println("Name: "+name+"\tHeight:"+height+"\t Weight: "+weight+"\tRollno: "+rollno);
	}
}

class Teacher extends Person
{
    String subject;
	public Teacher(String name, float height, int weight,String subject) 
	{
		super(name, height, weight);
		this.subject=subject;
		
	}
	public  String toString()
	{
		return "Name: "+name+" \tHeight: "+height+"\t Weight: "+weight+"\tSubject: "+subject;
	}
	
}

public class Abstract_constructor 
{
	public static void main(String[] args) 
	{
		
		Student s=new Student("SHUBHAM", 5.7f, 69, 24);
		s.show();
		
		Teacher t=new Teacher("KANCHAN", 5.3f, 85, "Signal and System");
		System.out.println(t);
		
	}

}
