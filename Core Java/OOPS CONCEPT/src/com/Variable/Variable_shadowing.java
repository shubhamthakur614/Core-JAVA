package com.Variable;

public class Variable_shadowing 
{
	String name = "Krishna";
	   int age = 25;
	   public void display(){
	      String name = "Vishnu";
	      int age = 22;
	      System.out.println("Name: "+name);
	      System.out.println("age: "+age);
	      //if you want to access instance variable then use this keyword
	      System.out.println("Name: "+this.name);
	      System.out.println("age: "+this.age);
	   }
	   public static void main(String args[]){
	      new Variable_shadowing().display();
	   }

}
