package com.Constructor;
class Copy
{
	int i,j;
	
	Copy(int n)
	{
		i=n;
	}
	Copy(Copy c)
	{
		j=c.i;
	}
	void show()
	{
		System.out.println(i+" "+j);
	}
}

public class Copy_date 
{
	public static void main(String[] args)
	{
		Copy c1=new Copy(10);
		Copy c2=new Copy(c1);
		c1.show();
		c2.show();
		
		
	}
	
	

}
