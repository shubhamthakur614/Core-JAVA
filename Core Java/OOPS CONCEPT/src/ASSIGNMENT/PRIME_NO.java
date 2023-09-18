package ASSIGNMENT;

import java.util.Scanner;

public class PRIME_NO {
	public static void main(String[] args) {

		int  flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NO:");
		int n = sc.nextInt();
		
		
		
		if(n<=1)
		{
			System.out.println(n+": IS NOT A PRIME NO");	
		}
		
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+": IS NOT A PRIME NO");
					flag=1;
					break;
				}
			}
			
			if(flag==0)
			{
				System.out.println(n+": IS PRIME NO");
			}
			sc.close();
		}

	}
}
