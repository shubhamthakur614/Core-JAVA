
package com.CollectionList;

import java.util.ArrayList;
import java.util.ListIterator;

class Student
{
	int id;
	String name;
	float per;
	
	public Student(int id,String name,float per)
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
	
}

public class ArrayList4 
{
	public static void main(String[] args)
	{
		Student s1=new Student(111, "SHUBHAM", 60.33f);
		Student s2=new Student(222, "KARTIK", 55.20f);
		Student s3=new Student(333, "VIRAJ", 65.33f);
		Student s4=new Student(444, "DEEPAK", 70.33f);
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		ListIterator itr=al.listIterator();
		while(itr.hasNext())
		{
			
			Student st=(Student)itr.next();
			System.out.println(st.id+" "+st.name+" "+st.per+" ");
			
		}
		//this is another way
		for(Student s:al)
		{
			System.out.println(s.id+" "+s.name+" "+s.per+" ");
		}
		
	}

}
