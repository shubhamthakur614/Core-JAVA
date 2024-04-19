package com.Collection.Set_TreeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

//if we want to do any customization in our own class then this is a program for that

class Employee implements Comparable<Employee> {

	int eid;
	String name;
	String designation;
	float salary;

	public Employee(int eid, String name, String designation, float salary) {
		this.eid = eid;
		this.name = name;
		this.designation = designation;
		this.salary = salary;

	}

	public int compareTo(Employee e)// based on the user eid here
	{
		if (eid < e.eid) {
			return -1;
		} else if (eid > e.eid) {
			return +1;
		} else {
			return 0;
		}
         // this.eid.compareTo(e.eid);
	}

}

class myEmployee implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Employee e1 = (Employee) obj1;
		Employee e2 = (Employee) obj2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s2.compareTo(s1);

	}
}

public class ComCom {
	public static void main(String[] args) {

//		TreeSet<Employee> t = new TreeSet<Employee>();
		List<Employee> t = new ArrayList<>();
		Employee e1 = new Employee(154, "SHUBHAM", "JAVA DEVELOPER", 50000);
		Employee e2 = new Employee(454, "VIRAJ", "PRODUCT ANALYST", 60000);
		Employee e3 = new Employee(10, "KARTIK", "SOFTWARE TESTING", 35000);
		Employee e4 = new Employee(784, "KARISHMA", "DESIGN", 40000);
		Employee e5 = new Employee(200, "AKSHRA", "UI DEVELOPER", 75000);

		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		// in case of tree set i don't need to call this sort method still it will sort
		// because of its property
//		but in case of other i need to call then only it will sort
		Collections.sort(t);

		System.out.println("BASED ON THE ASCENDING ORDDER OF EID SORTED: ");
		System.out.println("Eid, Name,  Designation,  Salary");
		for (Employee ee : t) {
			System.out.println(ee.eid + " " + ee.name + " " + ee.designation + " " + ee.salary + " ");
		}

		TreeSet<Employee> t1 = new TreeSet<Employee>(new myEmployee());


		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(" ");
		System.out.println("BASED ON THE ALPHABETICAL ORDER OF NAME SORTED: ");
		System.out.println("Eid, Name,  Designation,  Salary");

		// two way of getting same o/p first way
		for (Employee ee1 : t1) {
			System.out.println(ee1.eid + " " + ee1.name + " " + ee1.designation + " " + ee1.salary + " ");

		}

//		//second way
//		Iterator itr=t1.descendingIterator();
//		  while(itr.hasNext())
//		  {
//			  Employee ee1=(Employee)itr.next();
//			  System.out.println(ee1.eid + " " + ee1.name + " " + ee1.designation + " " + ee1.salary + " ");
//               
//			  
//		  }

	}

}
//
