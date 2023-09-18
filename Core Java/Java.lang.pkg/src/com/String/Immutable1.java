package com.String;

public class Immutable1 
{
	public static void main(String[] args)
	{
		String str=new String("SHUBHAM");
		str.concat("THAKUR");
		System.out.println(str);
		//we get o/p as shubham only becz string class is immutable you can not perform any change in object
		//if you trying to change a new object will be created with that change
		
	}

}
