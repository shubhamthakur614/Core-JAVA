package com.Abstraction;

abstract class VEHICAL
{
	//all the common method in other classes are defines in vehicle class 
	public void gear()
	{
		System.out.println("IT HAS MANUAL TRANSMISSION");
	}
	
	abstract public void NoofTyres();
	
	
}

class Bus1 extends VEHICAL
{
	@Override
	public void NoofTyres() 
	{
		System.out.println("NO OF WHEEL IN BUS IS :6");
		// TODO Auto-generated method stub
	}
}

public class ABSTRACT_COMPELTE_DEMO 
{
	public static void main(String[] args) {
		Bus1 b=new Bus1();
		b.NoofTyres();
		b.gear();
	}

}
