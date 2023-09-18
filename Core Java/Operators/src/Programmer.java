import java.util.ArrayList;

public class Programmer 
{
	
	
	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING with numeric value");
		String s1=sc.next();
		int length=s1.length();*/
		String line = "this website is aw3som3.";
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        String str[]=new String[500];
        
        int length=line.length();
        
        ArrayList ar=new ArrayList();
        ArrayList ar1=new ArrayList();
        ArrayList ar2=new ArrayList();
        
		
		for(int i=0;i<=length-1;i++)
		{
			char ch=line.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i'
	                || ch == 'o' || ch == 'u')
			{
				ar.add(ch);
			}
			
			else if (ch>='0' && ch<='9')
			{
				ar2.add(i);
			}
			
			
		}
		
		System.out.println("ARRAY with vowels: "+ar);
		System.out.println("ARRAY WITH CONSONANTS:"+ar1);
		System.out.println("ARRAY WITH NUMBERS:"+ar2);
		
		
	}

}
