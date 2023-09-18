package com.String;
//in case of string class == method meant for reference comparison/address Comparison
//where .equals() meant for content comparison for string class becz string class override the .equals ()
//but with respect to object class it meant for reference comparison
public class Equals_vs_DoubleEqual2
{
	public static void main(String[] args) 
	{
		String s1=new String("SHUBHAM");//using new keyword
		String s2="SHUBHAM";//using literal way but still same no diff.in both
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));//becz content comparison is happening
		
	}

}
