package com.stream_api;

import java.util.ArrayList;
import java.util.List;

class Student {
	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class Filter_method {
	public static List<Student> getStudent() {
		List<Student> l = new ArrayList();
		l.add(new Student(1, "shubham", 25));
		l.add(new Student(2, "rakesh", 22));
		l.add(new Student(3, "vivek", 23));
		l.add(new Student(4, "vikrant", 27));
		l.add(new Student(5, "rahul", 29));
		return l;

	}

	public static void main(String[] args) 
	{
		getStudent().stream().filter((student)->student.getAge()>25).forEach(System.out::println);

		System.out.println("\n");
		
		//sort student by there age
		getStudent().stream().sorted((a,b)->(a.getAge()>b.getAge())?+1:(a.getAge()<b.getAge()?-1:0)).forEach(System.out::println);
		
		
		System.out.println("\n sort based on name");
		
		//sort student by there name
		getStudent().stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(System.out::println);
		
System.out.println("\n sort based on name descending order");
		
		//sort student by there name desc
		getStudent().stream().sorted((a,b)->b.getName().compareTo(a.getName())).forEach(System.out::println);
	}

}
