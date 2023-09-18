package com.StringBuffer;

/* in case of StringBuffer == equals method meant for reference comparison.
//where .equals() method also meant for reference comparison becz 
//there is no BYDefault overriding in StringBuffer so object class 
method executed*/

public class Equals_vs_DoubleEqual2 
{
	public static void main(String[] args)
	{
		StringBuffer sb1=new StringBuffer("SHUBHAM");
		StringBuffer sb2=new StringBuffer("SHUBHAM");
		StringBuffer sb3=sb1;
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb3==sb1);
		System.out.println(sb3.equals(sb1));
		
	}

}
