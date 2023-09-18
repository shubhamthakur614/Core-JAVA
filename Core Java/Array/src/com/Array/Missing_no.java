package com.Array;

import java.util.HashMap;
import java.util.Map;

//There are two method to find the missing no

//1)using the sum of array and subtracting
//2)using hash map;

public class Missing_no {

	public static void main(String[] args) {
		int[] arr = { 1, 7, 3, 4, 5, 6 };
		int n = arr.length;
		missing1(arr,n);
		int[] arr1= {1,3,4,7,8,9,3,4};
		int n1=arr1.length;
		missing2(arr1,n1);

	}
	
	public static void missing1(int[] arr,int n)
	{// { 1, 7, 3, 4, 5, 6 }
		int sum=(n+1)*(n+2)/2;
		for(int i=0;i<arr.length;i++)
		{
			sum-=arr[i];
		}
		System.out.print(sum+"\n");
	}
	
	public static void missing2(int[] arr1,int n1)
	{
		//using hash map
		//{3,2,2,6,8,3,7}
		Map<Integer,Integer>hm=new HashMap<>();
		
		for(int digit:arr1)
		{
			if(hm.get(digit)==null)
			{
				hm.put(digit, 1);
			}
			else
			{
				System.out.println("Repeating no: "+digit);
			}
		}
		
		for(int i=1;i<n1;i++)
		{
			if(hm.get(i)==null)
			{
				System.out.print(i+" ");
			}
		}
		
		
	}

}
