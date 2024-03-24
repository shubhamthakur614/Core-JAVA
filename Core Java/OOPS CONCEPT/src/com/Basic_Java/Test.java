package com.Basic_Java;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int age;
	int salary;
	String Department;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int age, int salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		Department = department;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", Department="
				+ Department + "]";
	}

}

public class Test {
	static public void main(String[] args) throws FileNotFoundException {

		String s = "Welcome, Java Fullstack Developer";

		List<Integer> ll = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 9, 9);

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Z", 27, 28000, "IT"));
		list.add(new Employee(2, "A", 22, 38000, "HR"));
		list.add(new Employee(3, "B", 23, 29000, "PHP"));
		list.add(new Employee(5, "D", 24, 27000, "IT"));
		list.add(new Employee(28, "DD", 47, 14100, "MNGR"));
		list.add(new Employee(8, "E", 47, 28000, "HR"));
		list.add(new Employee(98, "F", 37, 29100, "PHP"));

		// sec highest salary
		Employee employee = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).distinct()
				.skip(1).findFirst().get();
		System.out.println(employee);

		// how many employee in each department find
		Map<String, Long> collect = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(collect);

		// find the highest salary from each department
		Map<String, Employee> collect2 = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors
				.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)));

		collect2.forEach((a, b) -> {
			System.out.println(a + " " + b.getSalary());
		});

		// find the duplicate from list using set or using grouping by
		Set<Integer> set = new HashSet<>();
		List<Integer> collect3 = ll.stream().filter(z -> !set.add(z)).collect(Collectors.toList());
		System.out.println(collect3);

//		OR

		List<Integer> collect4 = ll.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet()
				.stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey())
				.collect(Collectors.toList());
		System.out.println(collect4);

		// find frequency of String
		Map<Character, Long> collect5 = s.chars().mapToObj(x -> (char) x)
				.filter(z -> z.valueOf(z) != ' ' && z.valueOf(z) != ',')
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(collect5);

	}

}
