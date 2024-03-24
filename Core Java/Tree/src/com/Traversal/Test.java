package com.Traversal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	String department;
	double salary;

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

	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Shubham", "IT", 22000);
		Employee e2 = new Employee(5, "Abhishek", "HR", 49000);
		Employee e3 = new Employee(1, "ABC", "IT", 27000);
		Employee e4 = new Employee(1, "Rakesh", "Power BI", 24100);

		List<Employee> el = Arrays.asList(e1, e2, e3, e4);
		
		

		Map<String, Optional<Employee>> collect = el.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
//		Set<Entry<String, Optional<Employee>>> entrySet = collect.entrySet();
//
//		for (Entry<String, Optional<Employee>> e : entrySet) {
//			
//			System.out.println(e.getKey() + ": " + e.getValue().get().getSalary());
//		}
//		/ Print the results
		collect.forEach((department, employee) -> System.out.println("Department: " + department
				+ ", Highest Salary Employee: " + (employee.isPresent() ? employee.get() : "N/A")));

	}

}
