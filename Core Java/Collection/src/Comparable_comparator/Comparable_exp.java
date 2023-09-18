package Comparable_comparator;
//sort the student based on there age

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student st) {
		if (age == st.age) {
			return 0;
		} else if (age > st.age) {
			return 1;

		} else {
			return -1;
		}

	}

}

public class Comparable_exp {
	public static void main(String[] args) {
		List<Student> l = new ArrayList<>();
		l.add(new Student(1, "Shubham", 25));
		l.add(new Student(2, "Vivek", 40));
		l.add(new Student(3, "Kanchan", 15));
		l.add(new Student(4, "Sneha", 24));
		l.add(new Student(5, "Karishma", 23));

		Collections.sort(l);
		l.forEach(z -> {
			System.out.println(z.age + " " + z.name + " " + z.id);
		});

	}

}
