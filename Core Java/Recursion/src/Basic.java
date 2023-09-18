
public class Basic 
{
	public static void main(String[] args) {
//      pd(4);
		pi(4);
      
	}
	public static void pd(int n)
	{
		//when you go deep call first
		if(n==0)
		{
			return ;
		}
		System.out.println(n);
		pd(n-1);
		
	}
	public static void pi(int n)
	{
		//when you coming after removing function frame then print after recursion
		if(n<=0)
		{
			return ;
		}
		
		pi(n-1);
	 System.out.println(n);
		
		
	}

}
