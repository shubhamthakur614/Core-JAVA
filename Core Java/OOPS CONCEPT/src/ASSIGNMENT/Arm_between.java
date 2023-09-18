package ASSIGNMENT;

import java.util.Scanner;

public class Arm_between {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NO:");
		int first = sc.nextInt();
		System.out.println("ENTER THE LAST NO:");
		int last = sc.nextInt();
		printFibo(first, last);
	}
	

	public static void printFibo(int first, int last)
	{
		if(first<=100)
		{
			System.out.println("No armstrong....");
			
		}
		for (int i = first; i <= last; i++) 
		{
			int check, rem, sum = 0, temp = 1, count = 0;
			check = i;
			while (check != 0) {
				check = check / 10;
				count++;
			}
			check = i;
			while (check !=0) {
				rem = check % 10;
				for (int j = 1; j <= count; j++)
				{
					temp =temp* rem;

				}
				sum=sum+temp;
				temp=1;
				check=check/10;
			}
			if(sum==i)
			{
				System.out.println(" "+i+" is an armstrong number");
			}
	}
	}
	
}



