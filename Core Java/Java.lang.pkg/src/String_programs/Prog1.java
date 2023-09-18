package String_programs;
/*write a program to calculate the character in the string
except the white spaces*/
/*@ex
*I/p: "shubham anant thakur";
*O/P: 18;

*/

public class Prog1 
{
	public static void main(String[] args) 
	{
		String s="shubham anant thakur ";
		character(s);
		
	}
	public static void  character(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		
		System.out.println("Total No of character in the String are:"+count);
		
	}
	

}
