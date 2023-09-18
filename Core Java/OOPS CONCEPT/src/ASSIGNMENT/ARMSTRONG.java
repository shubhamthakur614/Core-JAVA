package ASSIGNMENT;

import java.util.Scanner;


//153,370,371,407 are Armstrong Numbers;
public class ARMSTRONG 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NO:");
		int n=sc.nextInt();
		int no,count=0,temp=1,sum=0,r;
		
		no=n;//no=153
		while(no!=0)//153!=0
		{
			no=no/10;//153/10=15.3
			count++;//c=1,2,3
		}
		
		no=n;//no=153
		while(no!=0)//153!=0
		{
			r=no%10;//r=153%10=3
			for(int i=1;i<=count;i++)//i=1,1<=3,i++;
			{
				temp=temp*r;//temp=1*3=3,after 3 time loop temp=27
				
			}
			sum=sum+temp;//sum=0+3
			temp=1;//temp=1
			no=no/10;//15/10=1
			
		}
		if(sum==n)
		{
			System.out.println(n+":ARMSTRONG NUMBER");
		}
		else
		{
			System.out.println(n+":NOT AN ARMSTRONG NUMBER");
		}
		
		
	}

}
