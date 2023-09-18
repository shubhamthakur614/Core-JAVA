
public class Coin_toss 
{
	public static void main(String[] args) 
	{
		int n=3;
		String value="";
		coin(n,value);
		
		
	}

	public static void coin(int n,String value)
	{
		if(n==0)
		{
			System.out.println(value);
			return ;
		}
		coin(n-1,value+"H");
		coin(n-1,value+"T");
		
	}
}
