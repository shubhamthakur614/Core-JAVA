package com.Array;

import java.util.Arrays;
import java.util.Collections;

//there are three method to reverse an one dimensional array
//1)using another array 
//2)using single while loop O(N)
//2)using swapping in the given array without new with n/2 size only
//3)using collections class utility method first convert into array list but for that use wrapper class

public class Array_reverse 
{
	
	public static void reverse1(int[] arr,int n)
	{
		//using another array brute force method
		
		int[] b=new int[n];
		
		int last=n-1;
		for(int i=0;i<n;i++)
		{
			b[last]=arr[i];
			last--;
		}
		System.out.println(Arrays.toString(b));
	}
	
	public static void reverse22(int[] arr,int n)
	{
		int a_pointer=0;
		int b_pointer=n-1;
		while(a_pointer<=b_pointer)
		{
			int temp=arr[a_pointer];
			arr[a_pointer]=arr[b_pointer];
			arr[b_pointer]=temp;
			a_pointer++;
			b_pointer--;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void reverse2(int[] arr,int n)
	{
		//swapping without new array using n/2
		for(int i=0;i<n/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void reverse3(Integer[] arr1)
	{
		Collections.reverse(Arrays.asList(arr1));
		System.out.println(Arrays.asList(arr1));
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6};
		Integer[] arr1={1,2,3,4,5,6};
		int n=arr.length;
		reverse1(arr,n);
		reverse2(arr,n);
		reverse3(arr1);
		int[] arr2={1,2,3,4,5,6};
		reverse22(arr2,n);
	}
}
