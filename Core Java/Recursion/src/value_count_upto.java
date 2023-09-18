import java.util.Scanner;

//w.r.p to calculate the sum between two values
//ex: 5,10
//ans 45;


public class value_count_upto 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);;
		System.out.println("Enter the first value:");
		int first =sc.nextInt();
		System.out.println("Enter the Last value");
		int last=sc.nextInt();
		
		int total=sum(first,last);
		System.out.println(total);
		
		
	}
	public static int sum(int first,int last)
	{
		if(last>first)
		{
			return last+sum(first,last-1);
		}
		else
		{
			return last;
		}
	}

}
