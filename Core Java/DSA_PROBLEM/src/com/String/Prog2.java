package com.String;
/*
 * w.r.p to calculate the frequency of the string 
 * ex:1
 *  I/P "ABBCDDeFf";
 *  O/P: A1 B2 C1 D2 e1 F1 f1;
 *  
 *  Case Study
 *  EX 2:
 *  I/P "ABB CD DeF f";
 *  O/P: A1 B2 C1 D2 e1 F1 f1;
 *  
 *  Case 
 *  Ex 3:
 *  I/P "ABB CD DeF f";
 *  O/P:  B2 D2 ;
 *  
 */
public class Prog2 
{
	public static void main(String[] args) 
	{
		String s="ABBCDDeFf";//"ABB CD DeF f"
		frequency(s);	
	}
	
	public static void frequency(String s)
	{
		int[] count=new int[100];//frequency calculation initially it is 0
		
		for(int i=0;i<s.length();i++)
		{
			//if for not include space inside the string otherwise exception 
			if(s.charAt(i)!=' ')
			{
				count[s.charAt(i)-'A']++;//frequency counting logic
			}	
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				if(count[s.charAt(i)-'A']!=0)
				{
					System.out.print(s.charAt(i));
					System.out.print(count[s.charAt(i)-'A']+" ");
					count[s.charAt(i)-'A']=0;
				}
			}
		}
		//if you only want toprint the duplicate value only
		/*
		 * for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
		   {
			if(count[s.charAt(i)-'A']>1)
			 	{
				System.out.print(s.charAt(i));
				System.out.print(count[s.charAt(i)-'A']+" ");
				count[s.charAt(i)-'A']=0;
				
			 	}
		   }
	   }
	}
		 * 
		 */
		
		
	}

    }
