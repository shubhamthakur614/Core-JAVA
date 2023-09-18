
public class Logicalopr_vs_bitwiseOpr 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=5;
		int c=30;
		int d=40;
		
		//logical && and bitwise &
		
		System.out.println(a>b && a++<c);// 1 st true thats why it go for 2 nd condition
		System.out.println(a);
		System.out.println(b>a && b++<c);//first not true then it not going for second;
		System.out.println(b);
		
		//but in case of bitwise and it check sec condition either first will true or false
		System.out.println(b>a & b++<c);
		System.out.println(b);
		
		
		//logical or || and bitwise or |
		
		System.out.println(c<d || c++>b);//if first condition true it not going to check second
		System.out.println(c);
		
		System.out.println(c<d | c++>b);
		System.out.println(c);
		
	}

}
