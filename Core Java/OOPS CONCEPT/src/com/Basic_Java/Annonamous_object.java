package com.Basic_Java;
class Anno_obj
{
	void fact(int n)
	{
		int a=1;
		for(int i=1;i<=n;i++)
		{
			a=a*i;
		}
		System.out.println(a);
		
	}
	
}

public class Annonamous_object 
{
	public static void main(String[] args) 
	{
		new Anno_obj().fact(5);
		
	}

}
