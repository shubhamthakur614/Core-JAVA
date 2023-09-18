import java.util.function.*;

class Student2 {
	String name;
	int marks;

	Student2(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

}

public class Consumer_demo {
	public static void main(String[] args) {

		Function<Student2, String> f = s -> {
			int marks = s.marks;
			String grade = "";
			if (marks >= 80)
				grade = "A Destinction";
			else if (marks >= 70) {
				grade = "B Pass";
			} else if (marks >= 60) {
				System.out.println("C lower Pass");
			} else {
				grade = " fail";
			}
			return grade;

		};

		Consumer<Student2> c = s1 -> {
			System.out.println(s1.name + " ");
			System.out.println(s1.marks + " ");
			System.out.println(f.apply(s1));
			System.out.println();
		};

		Student2[] stu = { new Student2("Shubham", 80), new Student2("Viraj", 50), new Student2("Kartik", 70),
				new Student2("Sneha", 60), new Student2("AKANSHA", 30) };

		for (Student2 s1 : stu) {

			c.accept(s1);

		}

	}

}
