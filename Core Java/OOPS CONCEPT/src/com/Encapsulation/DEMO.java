package com.Encapsulation;

class Student
{
	private  int rollno;
	private String name;
	private float marks;
	
	public void setRollno(int rollno)
	{
		this.rollno=rollno;	
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setMarks(float marks)
	{
		this.marks=marks;
	}
	public float getMarks()
	{
		return marks;
	}
	
}

public class DEMO {
	public static void main(String[] args)
	{
		Student s=new Student();
		s.setRollno(1);
		s.setName("Shubham");
		s.setMarks(65.13f);
		System.out.println(" Roll no: "+s.getRollno()+" Name: "+s.getName()+" Marks: "+s.getMarks());

	}

}
