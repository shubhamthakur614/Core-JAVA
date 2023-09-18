package com.Inheritance;
class Specification
{
	String name;
	String model;
	String color;
	Function function;
	int price;
	
	public Specification(String name, String model, String color,Function function, int price) {
		
		this.name = name;
		this.model = model;
		this.color = color;
		this.function=function;
		this.price = price;
	}
	
	
	
}

class Function
{
	String DrivingOption;
	String Breaks;
	String Airbags;
	public Function(String drivingOption, String breaks, String airbags) {
		
		DrivingOption = drivingOption;
		Breaks = breaks;
		Airbags = airbags;
	}
	
	
}


public class Car
{
	public static void main(String[] args) 
	{
		Function function=new Function("MANUAL", "DRUM", "SIX");
		Specification s=new Specification("BMW", "X1", "RED", function, 3700000);
		System.out.println("NAME OF CAR: "+s.name);
		System.out.println("MODEL: "+s.model );
		System.out.println("COLOR: "+s.color);
		System.out.println("DRIVING OPTION AVALIABLE: "+s.function.DrivingOption);
		System.out.println("BREAKS TYPE: "+s.function.Breaks);
		System.out.println("NO OF AIRBAGS AVAILABLE IN CAR: "+s.function.Airbags);
		
		
	}

}
