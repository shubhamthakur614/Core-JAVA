package com.Encapsulation;

class CAR1
{
	private int speed;
	
	public void setSpeed(int speed)
	{
		if(speed>=100)
		{
			this.speed=speed;
		}
		else
		{
			System.out.println("PLZ enter the speed more than 100");
		}
	}
	public int getSpeed()
	{
		return speed;
	}
	
}

public class Access_control_value 
{
	public static void main(String[] args) 
	{
		CAR1 c=new CAR1();
		c.setSpeed(10);
		System.out.println(c.getSpeed());
		
	}

}
