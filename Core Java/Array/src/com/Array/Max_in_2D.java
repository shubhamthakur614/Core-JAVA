package com.Array;

import java.util.Arrays;

public class Max_in_2D 
{
	public static void main(String[] args) {
		int[][] arr= {
				{10,12,13},
				{1,4,89,47,47},
				{12,78}
		};
		int target=47;
		int[] ans=search(arr,target);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] search(int[][] arr,int target)
	{
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				if(arr[row][col]==target)
				{
					return new int[] {row,col};
				}
			}
		}
		return new int[]{-1,-1};
	}

}
