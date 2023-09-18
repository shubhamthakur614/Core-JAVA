package com.Basic_Java;
import java.util.Scanner;



public class practice_3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);  
	       System.out.print("Enter the first number : ");  
	       int low = s.nextInt();  
	       System.out.print("Enter the second number : ");  
	       int high = s.nextInt();  
	       System.out.println("List of prime numbers between " + low + " and " + high);  
	      
    while (low < high) {
        boolean flag = false;

        for(int i = 2; i <= low/2; ++i) {
            // condition for non-prime number
            if(low % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag && low != 0 && low != 1)
            System.out.print(low + " ");

        ++low;
    }
}
	}

	
	
	 
	
	
	
	
		
		

		
		
		

	

