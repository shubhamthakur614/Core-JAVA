package com.array;
//time complexity is O(n);
//logic is
//[1,2,3,4,5,6};
// divid array in to two part 
//[1,2] [3,4,5,6] based on [0 to d-1] and [d to n-1] 
//then  reverse first and then second and then they all
//[2,1] [6,5,4,3] then all [3,4,5,6,1,2}

public class Array_left_roatation_algorithm 
{
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6};
		int d=2;
		left_rotation(arr,d);
	//after rotation print the array
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void left_rotation(int[]arr ,int d)
	{
		int n=arr.length;
		if(d==0)
			return;
//		there may be chance the d is more than array length
		d=d%n;
		//pass the value to reverse function
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}
	
	public static void reverse(int[] arr,int start,int end)
	{
		int temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}
