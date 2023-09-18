package com.Abstraction;
//if you dont know the implementation still  we can declare method as abstract just declared the method as abstract
abstract class Vehicle//declare the partial class
{
	public abstract int getnoofwheel();//only declare the method 
}

 class Bus extends Vehicle
{
	public int getnoofwheel()
	{
		return 6;
		
	}
}
 
 class Auto extends Vehicle
 
 {
	 public int getnoofwheel()
	 {
		 return 3;
	 }
 }
   

public class DetailsAbstract 
{
	public static void main(String[] args) 
	{
		Vehicle bus=new Bus();
		System.out.println("No of Wheel in Bus: "+bus.getnoofwheel());
		
		Vehicle auto=new Auto();
		System.out.println("No of wheel in Auto: "+auto.getnoofwheel());
		
		
	}

}
