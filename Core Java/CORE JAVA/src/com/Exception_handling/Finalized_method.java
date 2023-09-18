package com.Exception_handling;

public class Finalized_method 
{
  public void finalize()
  {
	  System.out.println("FINALIZE METHOD");
  }
  public static void main(String[] args) 
  {
	  Finalized_method f1=new Finalized_method();
	  Finalized_method f2=new Finalized_method();
	  f1=null;
	  f2=null;
	  System.gc();
	  
	  
	
}

} 
