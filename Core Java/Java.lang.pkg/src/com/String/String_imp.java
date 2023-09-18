package com.String;

public class String_imp 
{
	public static void main(String[] args) 
	{
		String s1=new String("shubham");//create 2 object one in scp and one in heap
		String s2=s1.toLowerCase();//no object will created becz no change in current object so s2 pointing to s1 in heap area 
		                                             //becz runtime change is happening 
		String s3=s1.toUpperCase();//new object created in heap area so s3 point in heap of new object
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		
		String s4="durga";//1 object will created  in scp
		String s5=s4.toString();//no object will created s5 pointing to s4 object in heap becz runtime object creation
		String s6=s4.toLowerCase();//no object creation s6 pointing to s4,s5 in heap
		String s7=s4.toUpperCase();//new object will created in heap DURGA and s7 pointing to that object in heap
		System.out.println(s4==s5);//true
		System.out.println(s4==s6);//true
		System.out.println(s4==s7);//false
		
	}

}
