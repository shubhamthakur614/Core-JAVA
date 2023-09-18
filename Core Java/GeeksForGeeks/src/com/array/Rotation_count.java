package com.array;
//using Linear Search
// suppose you have an array of 
//[4,5,1,2,3]
//you have to find the initial array so that how many rotation you have to do
//like [1,2,3,4,5];
//o/p 2;

public class Rotation_count 
{
	public static void main(String[] args) 
	{
//		int[] arr={4,5,1,2,3};
		int[] arr= {15, 18, 2, 3, 6, 12};
		int n=arr.length;
		System.out.println(initial_array(arr,n));
		
	}
	public static int initial_array(int[] arr,int n)
	{
		int min=arr[0];
		int min_index=0;
		for(int i=0;i<n;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
				min_index=i;
			}
		}
		return min_index;
	}

}
