package com.Without_library_function_methods;

public class Reverse_the_String 
{
	public static void main(String[] args) 
	{
		String Original="Hii This Is a JAVA Programmer";
		String rev="";
		//to calculate the length of string
        int count=0;
		for(char c:Original.toCharArray())
		{
			count++;
		}
		int lengthofstring=count;
		
		//to reverse the string
		for(int i=lengthofstring-1;i>=0;i--)
		{
			rev+=Original.charAt(i);
		}
		System.out.println("ORIGINAL STRING:"+Original);
		System.out.println("REVERSE THE STRING:"+rev);
	}

}
