package com.String;


//There are three method in string for comparison
//1).equals();//containt comparision
//2)== operator reference comparison
//3)compareTo();it compare value lexicographically
public class String_Compare_method 
{
	public static void main(String[] args) 
	{
		String s1=new String ("SACHIN");
		String s2=new String("VIRAT");
		String s3="SACHIN";
		String s4="virat";
		String s5="SACHIN";
		//.equals methods
		System.out.println("Equals methods: "+s1.equals(s3));
		
		//EQUALS IGNORECASE METHOD
		System.out.println("equalsIgnoreCase(): "+s2.equalsIgnoreCase(s4));
		
		//== operator method
		System.out.println(s1==s3);
		System.out.println(s3==s5);
		
		//compareTo()
		System.out.println(s4.compareTo(s3));
		
		
	}

}
