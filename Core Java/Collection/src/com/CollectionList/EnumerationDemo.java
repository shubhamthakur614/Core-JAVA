package com.CollectionList;
import java.util.*;
public class EnumerationDemo 
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		
		//by using the enumeration how we can get the values one by one
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			Integer I=(Integer)e.nextElement();	
			
			if(I%2==0&& I!=0)
			{
				System.out.println(I);
			}
			
		}
		
	}

}
