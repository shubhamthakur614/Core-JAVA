import java.util.ArrayList;
import java.util.Collections;

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
	public int compareTo(Student o) {
		if (id == o.id) {
			return 0;
		} else if (id > o.id) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class Test4 {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(12, "shubham", 25));

		al.add(new Student(1, "vivek", 29));
		al.add(new Student(10, "Rani", 23));
		al.add(new Student(4, "ravi", 24));
		for (Student s : al) {
			System.out.println(s.id + " " + s.name + " " + s.age);
		}
		System.out.println("------------------------");
		Collections.sort(al);
		for (Student s : al) {
			System.out.println(s.id + " " + s.name + " " + s.age);
		}

	}

}