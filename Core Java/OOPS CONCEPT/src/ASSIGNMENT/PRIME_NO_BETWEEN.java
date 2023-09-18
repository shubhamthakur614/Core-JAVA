package ASSIGNMENT;

import java.util.Scanner;

public class PRIME_NO_BETWEEN 
{
	public static void main(String[] args)
	{
		int flag=0;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FIRST AND LAST NO:");
		int first=sc.nextInt();
		int last=sc.nextInt();
		System.out.println("THE PRIME NO BETWEEN "+first+" AND " +last+" ARE ");
		if(first==0|| last==1)
		{
			System.out.println("No Prime No between this");
		}
		else
		{
		
		for(int i=first;i<=last;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i % j==0)
				{
					flag=0;
					break;
				}
				else
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				count++;
				System.out.print(i+" ");
				
			}
			sc.close();
		}
		
		}
		
		System.out.println("\n Total Prime NO Between "+first+" and "+last +" is "+count);
		
		
	}

}
