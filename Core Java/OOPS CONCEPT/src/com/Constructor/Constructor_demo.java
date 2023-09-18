//constructor does not have the static final,interface
//Constructor return current class instance
package com.Constructor;
class Student
{
	int id;
	String name;
	float sal;
	
	Student()
	{
		System.out.println("DEFAULT CONSTRUCTOR:");
	}
	
	Student(int i,String n,float s)
	{
		id=i;
		name=n;
		sal=s;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+sal);
	}
	
}

public class Constructor_demo 
{
	public static void main(String[] args) 
	{
		Student st=new Student(1,"SHubham",14000);
		Student st1=new Student(2,"Viraj",15000);
		st.display();
		st1.display();
		
	}

}
