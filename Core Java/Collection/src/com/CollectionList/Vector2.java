package com.CollectionList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Vector2 
{
	public static void main(String[] args) 
	{
		try
		{
			Vector <String >v=new Vector<String>();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the No of name required:");
			int n=Integer.parseInt(br.readLine());
			System.out.println("Enter the names:");
			for(int i=0;i<n;i++)
			{
				v.add(br.readLine());
				
			}
			System.out.println("NAMES ARE:");
			for(String name:v)
			{
				System.out.println(name);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
