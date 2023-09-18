package com.Encapsulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Encapsu
{
	private int i;
	private String name;
	private float sal;
	
	public void setI(int id) 
	{
		this.i=id;
		
	}
	public int getI()
	{
		return i;
	}
	public void setName(String n)
	{
		this.name=n;
		
	}
	public String getName()
	{
		return name;
	}
	public void setSal(float s)
	{
		this.sal=s;
	}
	public float getSal()
	{
		return sal;
	}
	
}

public class DetailsEncapsulation
{
	
	public static void main(String[] args) 
	{
		try {
			
		
		Encapsu e=new Encapsu();
		e.setI(10);
		System.out.println(e.getI());
		System.out.println("ENTER THE NAME AND SALARY:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String n=br.readLine();
        float s=Float.parseFloat(br.readLine());
        e.setName(n);
        e.setSal(s);
        System.out.println(e.getName()+" "+e.getSal());
        
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
