
public class Logical_operator 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=5;
		int c=20;
		//the && never check the 2nd condition if first condition is false
		System.out.println(a<b && a<c);//false&& true
		//but logical bitwise & operator always check if 1st condition true or false
		System.out.println(a<b & a<c);//false & true
		
		//how we can say
		System.out.println(a<b && a++<c);
		System.out.println(a);
		//logical bitwise and
		System.out.println(a<b & a++<c);
		System.out.println(a);
		
		//logical OR and Bitwise Or
		//the logical or dosen't check 2nd condition if first condition is true
		System.out.println(a>b || a++<c);//not checking 2nd condition
		System.out.println(a);
		System.out.println(a<b | a++<c);//check any way
		System.out.println(a);
		
		
	}

}
