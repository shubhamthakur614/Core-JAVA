package com.Array;
//there are many way you can rotate array


//2)By iterative way O(n)using while loop 
//3)using recursion method also

public class _1array_reverse {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int n=arr.length;
		
		print_Array(arr,n);
		//reverse_Array(arr,n);
		System.out.println("Reverse array is: ");
		//print_Array(arr,n);
		reverse_array_using_recursion(arr,0,5);
		print_Array(arr,n);
		
		

	}
	//printing method
	public static void print_Array(int[] arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	//reverse the array method
	public static void reverse_Array(int[] arr,int n)
	{
		int temp,start=0,end=n-1;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}
	public static void reverse_array_using_recursion
	(int[] arr,int start,int end) 
	{
		int temp;
		if(start>=end)
		return;
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		reverse_array_using_recursion(arr, start+1, end-1);
	}

}
