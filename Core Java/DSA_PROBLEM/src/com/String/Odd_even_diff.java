package com.String;

public class Odd_even_diff
{
	public static void main(String[] args) {
		String s="12345";
	    int num=0;
	    int num1=0;
	    num=num+s.charAt(0) - '0';
	    for(int i=1;i<s.length();i++)
	    {
	    	if(i%2==0)
	    	{
	    		num=num+s.charAt(i)-'0';
	    	}
	    	else
	    	{
	    		num1=num1+s.charAt(i)-'0';
	    	}
	    }
	    System.out.println(num-num1);
	    
	}

}
