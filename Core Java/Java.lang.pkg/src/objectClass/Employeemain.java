package objectClass;

public class Employeemain {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEid(1);
		e.setName("Shubham");

		Employee e1 = new Employee();
		e1.setEid(1);
		e1.setName("Shubham");
		System.out.println("Shallow compare: " + (e == e1));

		System.out.println("Deep compare: " + e.equals(e1));

	}

}
