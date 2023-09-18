package com.Final;
class Final
{
	final int a=10;
	void show()
	{
//		a=100;
		//if you make any variable as final then you can reassign  value to that variable 
		System.out.println(a);
	}
}

public class Final_variable 
{
	public static void main(String[] args) 
	{
		Final f=new Final();
		f.show();
	}

}
