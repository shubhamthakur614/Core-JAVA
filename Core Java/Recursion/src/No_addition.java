import java.util.Scanner;

public class No_addition 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the NO:");//ex:upto you want calculation :10 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int add=0;
		
		sum(n,add);
	}
	public static void sum(int n,int add)
	{
		if(n==0)
		{
			System.out.println(add);
			return;
		}
		sum(n-1,n+add);
		
	}

}
