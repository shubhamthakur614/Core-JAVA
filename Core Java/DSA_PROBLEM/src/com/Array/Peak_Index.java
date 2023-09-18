package com.Array;
//[1211]//or [1213}==output is 3 index greater

//o/p 1 index is greater than 2 neighbouring no

public class Peak_Index {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 1 };
		System.out.println("Peak no present in the index No: "+peak(arr));
	}
	public static int peak(int[] arr)
	{
		int n=arr.length;
		if(arr[0]>arr[1])
		{
			return 0;
		}
		else if(arr[n-1]>arr[n-2])
		{
			return n-1;
		}
		
		for(int i=1;i<n-1;i++)
		{
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
			{
				return i;
			}
		}
		return 0;
		
	}

}
