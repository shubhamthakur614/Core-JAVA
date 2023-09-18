package com.Exception_handling;
import java.util.Scanner;

class Blood_requirement extends Throwable
{
	public Blood_requirement(String s)
	{
		super(s);
	}
	
}

public class Throw_program 
{
   public static void main(String[] args) 
   {
	   System.out.println("ENTER THE BLOOD GROUP YOU REQUIRED:");
	   Scanner sc=new Scanner(System.in);
	   
	   try
	   {
		  
		   char c=sc.nextLine().charAt(0);
		   if(c=='A'||c=='a'||c=='B'||c=='b'||c=='O'||c=='o')
		   {
			   System.out.println("WE HAVE THE BLOOD FOR YOUR REQUIREMENT:"+c);
			   
		   }
		   else
		   {
			   
			   throw new Blood_requirement("SORRY WE DONT HAVE BLOOD FOR YOUR REQUIREMENT RIGHT NOW!!!!!!");
		   }
		   
	   }
	   catch(Blood_requirement br)
	   {
		   br.printStackTrace();
		   
	   }
	   
	   
	   
	
   	}
	

}
