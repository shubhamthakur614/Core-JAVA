package com.Array;

import java.util.Scanner;

public class Array_multiplication 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[3][3];//A element
		int[][] b=new int[3][3];//B element
		int[][] c=new int[3][3];//to store multiplication
		//taking values from user
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println("Enter the Value in array A:"+i+" "+j);
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println("Enter the Value in array B:"+i+" "+j);
				b[i][j]=sc.nextInt();
			}
		}
		
		//multiplication of array A*B;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[i][j]=0;//for clearing values in c array
				for(int k=0;k<a.length;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];//a[rows][1 array]*b[2 array][column]
				}
			}
		}
		//for printing the array
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
