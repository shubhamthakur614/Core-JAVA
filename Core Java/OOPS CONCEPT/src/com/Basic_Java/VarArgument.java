package com.Basic_Java;

//if want to pass multiple value but you dont know how much use variable length argument
// and it always create array to store that things and it always be the last parameter to method
import java.util.Arrays;

public class VarArgument 
{
	public static void main(String[] args) 
	{
		fun(10,20,"shubham","rakesh","prashant");
		
	}
	static void fun(int a,int b,String ...name)
	{
		System.out.println(a+" "+b+" "+Arrays.toString(name));
	}

}
