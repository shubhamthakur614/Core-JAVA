package com.array;
//O(N) axilary space o(1)
import java.util.Arrays;

// we have array [1,2,3,4,5,6];
//rotate like one [6,1,2,3,4,5]
public class Array_cylendric_rotation 
{
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6};
		
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		System.out.println(Arrays.toString(arr));
	}

}
