package com.Array;

import java.util.Arrays;

public class Array_left_rotation 
{
	
	public static void rotate_left(int[] arr,int n,int k)
	{
		for(int i=0;i<k;i++)
		{
			int temp=arr[0];
			for(int j=0;j<n-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[n-1]=temp;
		}
	}
	public static void main(String[] args) 
	{
		int[] arr=new int[] {1,2,3,4,5,6};
		int k=3;
		int n=arr.length;
		System.out.println(Arrays.toString(arr));
		rotate_left(arr,n,k);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
