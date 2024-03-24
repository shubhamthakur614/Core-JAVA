package com.interview.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//find the second highest salary of employee from list or array using java 8 and with normal java as well

class Employee {
	int id;
	String name;
	double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Q1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 12, 17, 54, 18, 17, 54);
		List<Employee> elist = new ArrayList<>();
		elist.add(new Employee(1, "SHubham", 14200));
		elist.add(new Employee(2, "zrr", 27200));
		elist.add(new Employee(4, "aaa", 34200));
		elist.add(new Employee(3, "abc", 74200));
		elist.add(new Employee(2, "abc", 74200));
		for (Employee e1 : elist) {
			System.out.println(e1.id + " " + e1.name + " " + e1.salary);
		}

		Integer integer = list.stream().sorted((x, y) -> y - x).distinct().skip(2).findFirst().get();
		System.out.println(integer);
		Double double1 = elist.stream().map(Employee::getSalary).sorted(Collections.reverseOrder()).distinct().skip(1)
				.findFirst().get();
		System.out.println(double1);
		Employee employee = elist.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).distinct()
				.skip(1).findFirst().get();
		System.out.println(employee);
		secHighNo(list);
		
		//SQL QUERY as Well
		//select * from employee e1 where 1=(select count(distinct(Salary)) from employee e2 where e2.Salary>e1.Salary);
	
	}

	// using normal java program
	public static void secHighNo(List<Integer> l) {

		int highest = 0;
		int secHighest = 0;
		for (Integer i : l) {
			if (highest < i) {
				secHighest = highest;
				highest = i;
			} else if (i > secHighest && i != highest) {
				secHighest = i;
			}
		}
		System.out.println(highest + " " + secHighest);
	}

}
