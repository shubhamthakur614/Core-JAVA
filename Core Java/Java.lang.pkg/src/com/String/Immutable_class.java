package com.String;
//make class as final so no one can extends

//make variable as final so no one modify its value 

//make variable private so no one can access
//don't make any setter method

final class Student {

	private final String name;

	public Student(String name) {

		this.name = name;
	}

	public Student modify(String name) {
		if (this.name == name) {
			return this;
		}

		else {
			return new Student(name);
		}
	}

	public String getName() {
		return name;
	}

}

public class Immutable_class {
	public static void main(String[] args) {

		Student s = new Student("shubham");
		Student s2 = s.modify("Rakeesh");
		Student s3 = s.modify("shubham");
		Student s4 = new Student("shubham");
		System.out.println(s == s2);
		System.out.println(s == s3);
		System.out.println(s == s4);

	}

}
