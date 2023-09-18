
public class Fibo2 
{
	public static void main(String[] args) {
		int n=10;
		System.out.println(printfibo(n));
	}
	public static int printfibo(int n)
	{
		if(n<2)
		{
			return n;
			
		}
		return printfibo(n-1)+printfibo(n-2);
		
		
	}

}
