package com.Array;
/*
 * ex: int[][]={{1,2,3}{1,2,1}{1,3,1}};
 * o/p 6
 *  1+2+3=6 find max sum of  2D array
 * 
 * 
 */

public class _2DArra_sum_max_count 
{
	public static void main(String[] args) 
	{
		int[][] accounts= {
				{1,2,3},
				{1,2,1},
				{1,3,1}
		};
		System.out.println(maxsum(accounts));
		
	}
	public static int maxsum(int[][] accounts)
	{
		int max=Integer.MIN_VALUE;
		for(int row=0;row<accounts.length;row++)
		{
			int sum=0;
			for(int col=0;col<accounts[row].length;col++)
			{
				sum=sum+accounts[row][col];
			}
			if(sum>max)
			{
				max=sum;
			}
		}
		return max;
	}

}
