package com.Traversal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private String department;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

}

public class Test2 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 4, 2, 6, 1, 4, 3, 8, 5, 2);
		Employee e1 = new Employee(1, "shubham", "IT", 27400);
		Employee e2 = new Employee(2, "Sneha", "HR", 127400);
		Employee e3 = new Employee(4, "Amruta", "ITC", 47400);
		Employee e4 = new Employee(7, "Rakesh", "IT", 21400);
		Employee e5 = new Employee(3, "Prakash", "HR", 3500);

		List<Employee> elist = Arrays.asList(e1, e2, e3, e4, e5);

		Employee employee = elist.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println(employee);
		Map<String, Employee> collect2 = elist.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))))
				.entrySet().stream().collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue().get()));

		collect2.forEach((i, j) -> {
			System.out.print(i+": ");
			System.out.println(j.getSalary());
		}

		);

		elist.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors
				.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));
		Map<String, Long> collect = elist.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(collect);

	}

}
