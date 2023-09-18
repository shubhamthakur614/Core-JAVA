 package com.Variable;

// the variable which are not varied object to object then it is not recommended 
// to use the instance variable go with 
//static variable belong to class
//static variable declared at class loading(when .class file is stored into memory static 
// variable is created) 
//static variable is stored in method Area
public class Static_variable 
{
    static int i=10;
    public static void main(String[] args)
    {
    	Static_variable sv=new Static_variable();
    	System.out.println(sv.i);//it is not recommended becz it use for instance so code readability reduces
    	System.out.println(Static_variable.i);// it also not recommended at same class
    	System.out.println(i);//this is the best way to use in the same class
    	sv.m1();
		
	}
    public void m1()
    {
    	System.out.println(i);//we can use static variable at non static method also becz they are created at class loading 
    }
	

}
