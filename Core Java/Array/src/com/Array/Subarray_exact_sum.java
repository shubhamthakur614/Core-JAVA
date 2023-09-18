package com.Array;

import java.util.HashMap;
import java.util.Map;

//1)Bruteforce approach  using 2 for loop and checking O(N2)
//2)using hashmap
//explanation
/*                        { 3, 9, -2,  4,  1,  -7, 2, 6, -5, 8, -3, -7, 6, 2, 1};              k=5;
 *          sum  =  0+ 3 12 10 14  15  8
 *                       1  1   1   1   1   1   1
 *                           ----------3,9,-2, =10       
 *                                         ------------------4,1=5     10-5=5
 *                           --3
 *                               ----------------------9,-2,4,1-7      
            sum+=arr[i];// sum-k//if not available make 1
*/
public class Subarray_exact_sum 
{
	public static int subarray_sum(int[] arr,int n,int k)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=i;j<n;j++) //{ 10, 2, -2, -20, 10 }; k=-10
			{
				sum+=arr[j];
				//check  whether the sum is equal to k
				if(sum==k)
				{
					count++;
					System.out.println("From index:" +i+" To index:  "+j);
				}
			}
		}
		return count;
	}
	
	public static int subarray_sum2(int[] arr,int n,int k)
	{
		int count=0;
		Map<Integer,Integer>hm=new HashMap<>();
		hm.put(0, 1);
		
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];//{3,9,-2,4,1,-7,2,6,-5,8,-3,-7,6,2,1}; k=-10
			if(hm.containsKey(sum-k))
			{
				count+=hm.get(sum-k);
			}
			hm.put(sum, hm.getOrDefault(sum,0)+1);
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int[] arr1= { 10, 2, -2, -20, 10 };
		int n=arr1.length;
		int k=-10;
		
		int[] arr= { 10, 2, -2, -20, 10 }; //{3,9,-2,4,1,-7,2,6,-5,8,-3,-7,6,2,1};
		int n2=arr.length;
		int k1=-10;//5;
		
	System.out.println(subarray_sum(arr1,n,k)+" : By bruteforce approach total no of way we get target");
		System.out.println(subarray_sum2(arr,n2,k1)+" : By Hashing Approach");
		
		
	}

}
