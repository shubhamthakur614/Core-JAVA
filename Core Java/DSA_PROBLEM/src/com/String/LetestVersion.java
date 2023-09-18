package com.String;

import java.util.Scanner;

public class LetestVersion
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 version no like 12.13.14");
		String ver1=sc.next();
		String ver2=sc.next();
		System.out.println(version(ver1,ver2));
		
	}
	public static int version(String ver1,String ver2)
	{
		String[] s1=ver1.split("\\.");
		String[] s2=ver2.split("\\.");
		
		int maxlength=Math.max(s1.length, s2.length);
		
		for(int i=0;i<maxlength;i++)
		{
			int v1=i<s1.length?Integer.parseInt(s1[i]):0;
			int v2=i<s2.length?Integer.parseInt(s2[i]):0;
			if(v1>v2)
			{
				return 1;
			}
			else if(v1<v2)
			{
				return -1;
			}
		}
		
		return 0;
	}

}
