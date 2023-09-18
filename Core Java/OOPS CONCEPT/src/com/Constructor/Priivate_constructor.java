package com.Constructor;
//if a class contain a private constructor the object creation of that 
//class is not possible from another class

//if you want to create the object of private constructor outside the same 
//class we have to use static factory method
//Factory method:ANY java method that is having capability of for 
//constructing or returning of same class object reference then that
//type of method we called as factory methods
//In java we have 2 types of factory methods
//1)static factory method
//2)non-static factory methods

//Static factory methods are very useful to create private constructor class
//objects from another class
//for example when ever we are calling getEmployeeinstance() an constructor 
//is called and create return the employee object at 
//calling method

//in java many classes have only private constructor best example 
//java.lang.Runtime contain only the private constructor
//java.lang.Class also contain only private constructor

class  Employee {
	// we having a private constructor how we can create the object for this private
	// constructor
	private Employee() 
	{
		System.out.println("PRIVATE EMPLOYEE CONSTRUCTOR");

	}

	// factory method which return class object reference
	public static Employee getEmployeeInstance() {
		return new Employee();
	}
}

//from another class we calling private constructor

public class Priivate_constructor {
	public static void main(String[] args) {
		//as this method is static thats why class name to call this method
		
      Employee e1=Employee.getEmployeeInstance();
      System.out.println(e1.hashCode());
      //if you want you can create multiple object
      Employee e2=Employee.getEmployeeInstance();
      System.out.println(e2.hashCode());//to check we get different object
      
      //if you want to try you can directly create the object of runtime or Class you get error
      
     // Runtime r=new Runtime();
      //but the runtime class already provide the static factory method to create the object from your own class
      Runtime r=Runtime.getRuntime();
	}

}
