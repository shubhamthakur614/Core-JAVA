package INCREMENT_DECREMENT;

public class Increment2 
{
	public static void main(String[] args) 
	{
		byte a=10;
		byte b=10;
		
		byte c=(byte)(a+b);//we must have to do type casting otherwise get CE:NOT CONVERT 4 BIT INTO 1 BIT
		System.out.println(c);
		
		byte z=10;
		byte x=(byte)(z+1);
		System.out.println(x);
		
		
		
	}

}
