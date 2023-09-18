package com.Exception_handling;

class UserDefinedException extends Exception
{  
    public UserDefinedException(String str)  
    {  
        // Calling constructor of parent Exception  
        super(str+"This is user-defined exception");  
    }  
}  
public class ExceptionPractice {
	  public static void main(String args[])  
	    {  
	        try  
	        {  
	            // throw an object of user defined exception  
	            throw new UserDefinedException("");  
	        }  
	        catch (UserDefinedException ude)  
	        {  
	            System.out.println("Caught the exception");  
	            // Print the message from MyException object  
	            System.out.println(ude);  
	        }  
	    }
		

	}

