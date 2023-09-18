package com.Collecctions.utility;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_sort_Demo 

{
	public static void main(String[] args) 
	{
		//in array list if you want the sorthing then go for collections utility class methods sort()
		
	     ArrayList l=new ArrayList();
	     
	     l.add("S");
	     l.add("X");
	     l.add("A");
	     l.add("Z");
	     //l.add(null);//bull insertion is not allowed becz comparison has to perform
	     //l.add(5);//only homogenious object can insert for comparison
	     
	     System.out.println("BEFORE THE SORTING ACTUAL INSERTION ORDER"+l);
	     Collections.sort(l);
	     System.out.println("AFTER SORTING"+l);
	
		
	}

}
