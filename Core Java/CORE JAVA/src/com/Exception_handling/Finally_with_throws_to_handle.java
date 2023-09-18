package com.Exception_handling;
import java.io.FileInputStream;

public class Finally_with_throws_to_handle 
{
	public static void main(String[] args)throws Exception
	{
		FileInputStream fin=null;
		try
		{
			fin=new FileInputStream("E:/abc.text");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			if(fin!=null)
			{
				
			
			//we write the closing resource code in finally
			fin.close();//close will throw an exception that can solve by try catch also
			}
			
		}
		
		
	}

}
