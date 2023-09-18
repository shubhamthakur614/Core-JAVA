package Comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {
	int id;
	String name;
	int age;

	public Students(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

class ByName implements Comparator<Students> {

	@Override
	public int compare(Students s1, Students s2) {

		return s1.name.compareTo(s2.name);
	}

}

public class Comparator_exp {
	public static void main(String[] args) {
		List<Students> l = new ArrayList<>();
		l.add(new Students(1, "Shubham", 25));
		l.add(new Students(2, "Akash", 40));
		l.add(new Students(3, "Kanchan", 15));
		l.add(new Students(4, "Sneha", 24));
		l.add(new Students(5, "Karishma", 23));

		Collections.sort(l, new ByName());
		l.forEach(z -> {
			System.out.println(z.name + " " + z.age + " " + z.id);
		});
	}
}
