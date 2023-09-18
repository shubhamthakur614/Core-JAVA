import java.util.function.*;

class Student1 {
	String name;
	int marks;

	Student1(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

}

public class Function_demo {
	public static void main(String[] args) {
		Student1[] stu = { new Student1("Shubham", 80), new Student1("Viraj", 50), new Student1("Kartik", 70),
				new Student1("Sneha", 60), new Student1("AKANSHA", 30) };
		Function<Student1, String> f = s -> {
			int marks = s.marks;
			String grade = "";
			if (marks >= 80)
				grade = "A Destinction";
			else if (marks >= 70) {
				grade = "B Pass";
			} else if (marks >= 60) {
				System.out.println("C lower Pass");
			}
			else
			{
				grade=" fail";
			}
			return grade;

		};
		Predicate<Student1>p=s->s.marks>50;
		
		for(Student1 s1:stu)
		{
			if(p.test(s1)) {
			System.out.println(s1.name+" ");
			System.out.println(s1.marks+" ");
			System.out.println(f.apply(s1));
			System.out.println();
			}
			
			
		}

	}

}
