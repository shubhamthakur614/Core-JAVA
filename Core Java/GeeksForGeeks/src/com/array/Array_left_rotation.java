package com.array;
// for time complexity is o(n^2);

public class Array_left_rotation
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6};
		int d=3;
		rotation(arr,d);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void rotation(int[] arr,int d)
	{
		int n=arr.length;
		for(int i=0;i<d;i++)
		{
			int temp=arr[0];
			for(int j=0;j<n-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[n-1]=temp;
		}
		
	}

}
