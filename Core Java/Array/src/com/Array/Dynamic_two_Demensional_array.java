package com.Array;

import java.util.ArrayList;
import java.util.List;

//with the help of list we can increase the size of array dynamically

public class Dynamic_two_Demensional_array
{
	public static void main(String[] args)
	{
		//this is how we declare dyanamic array
		List<int[] >l=new ArrayList<int[]  >();
		l.add(new int[] {10,12,14});
		l.add(new int[] {17,19});
		l.add(new int[] {11,15,13});
		
		for(int[] a:l)
		{
			for(int z:a)
			{
				System.out.print(z+" ");
			}
			System.out.println();
				
		}
		
		
		
	}
	

}
