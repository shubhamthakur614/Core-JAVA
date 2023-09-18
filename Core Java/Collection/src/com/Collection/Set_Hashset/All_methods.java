package com.Collection.Set_Hashset;
import java.util.*;
public class All_methods 
{
	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
		
		//Add method
		
		h.add("SHUBHAM");
		h.add("Sneha");
		System.out.println("Displaying By ADD METHOD "+h);
		
		//Clone method
		
		HashSet h1=new HashSet();
		h1=(HashSet) h.clone();
		System.out.println("");
		System.out.println("DISPLAYING BY CLONE METHOD: "+h1);
		
		//Clear method
		h1.clear();
		System.out.println("");
		System.out.println("CLEAR METHOD"+h1);
		
		//contains method
		h.contains("Sneha");
		System.out.println("");
		System.out.println("Contains method to check the element: "+h.contains("Sneha"));
		
		//Is empty method
		System.out.println("");
	    System.out.println("IS IS EMPTY OR NOT:");
	     System.out.println(h.isEmpty());
	     System.out.println(h1.isEmpty());
	     
	   //Remove method
	     System.out.println("");
	    h.remove("Sneha");
	    System.out.println("AFTER REMOVAL OF OBJECT: "+h);
	    
	    //size method
	    System.out.println(h.size());
	    //Add all method
	    
	    h1.add("KARISHMA");
	    h1.add("Snehu");
	    System.out.println(h1);
	    
	    h.addAll(h1);
	    System.out.println("AFTER ADDING ADD ALL METHOD TO H: "+h);
       		
	}

}
