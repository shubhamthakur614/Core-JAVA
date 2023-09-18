package com.CollectionList;
import java.util.*;
public class LinkedLISTdUPLICATEREMOVE 
{
	public static void main(String[] args)
	{
		//we can remove the duplicate by converting into set
		LinkedList<String> l=new LinkedList<String>();
		    l.add("Mango");  
	        l.add("Banana");  
	        l.add("Mango");  
	        l.add("Apple"); 
	        System.out.println("BEFORE THE CONVERSION from list TO SET: "+l);
	        //conversion from list to set
	        HashSet <Object>lh=new HashSet<Object>(l);
	        System.out.println(lh);
		
	}

}
