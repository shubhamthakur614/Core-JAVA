package ASSIGNMENT;
/*EX
 * input:123456
 * output:1=2=3=4=5=15;
 * 
 */
import java.util.Scanner;

public class sum_of_digits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to perform addition");
		int n=sc.nextInt();
		int sod=0;
		int last_No=0;
		
		while(n!=0)
		{
			last_No=n%10;//to get reminder for last no//151%10//1//5//1
			sod=sod+last_No;//0+1=1//1+5=6//6+1=7
			n=n/10;//151/10=15//15/10=1//0.1
		}
		System.out.println(sod);
		
	}

}
