package com.CollectionList;
import java.util.*;
public class Iterator_demo 
{

	public static void main(String[] args)
	{
		List l=new ArrayList();
	    
		for(int i=0;i<=10;i++)
		{
			l.add(i);
		}
	 System.out.println(l);
	 
	 //using the iterator 
	 
	 Iterator itr=l.iterator();
	 while(itr.hasNext())
	 {
		 Integer I=(Integer)itr.next();
		 if(I%2==0)
		 {
			 System.out.println(I);
		 }
		 else
		 {
			 itr.remove();
		 }
		
		 
	 }
	 System.out.println(l);
		
		
	}
}
