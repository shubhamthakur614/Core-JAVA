package Comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//i want to sort the student based on there name if there name is same then sort by 
//there marks

class Student1 {
	private int id;
	private String name;
	private int marks;

	public Student1(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}

class MixCondition implements Comparator<Student1> {

	// compare by name if name same then compare by there marks
	@Override
	public int compare(Student1 o1, Student1 o2) {

		if (o1.getName().equals(o2.getName())) {
			return o2.getMarks() - o1.getMarks();
		} else {
			return o1.getName().compareTo(o2.getName());
		}
	}

}

public class IMP_Comparator {
	public static void main(String[] args) {
		List<Student1> l = new ArrayList<>();
		l.add(new Student1(9, "Shubham", 12));
		l.add(new Student1(1, "Rakesh", 12));
		l.add(new Student1(5, "Shubham", 29));
		l.add(new Student1(81, "Abhishek", 12));
		l.add(new Student1(3, "Shubham", 12));
		Collections.sort(l, new MixCondition());
		l.forEach(x -> {
			System.out.println(x.getId() + " " + x.getName() + " " + x.getMarks());
		});
	}

}
