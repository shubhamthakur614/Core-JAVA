package com.Without_library_function_methods;

public class String_permutation_distinct 
{
	public static void main(String[] args) 
	{
		String que="ABC";
		String ans="";
		permutation(que,ans);

	}
	
	public static void permutation(String que,String ans)
	{
		if(que.length()==0)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<que.length();i++)
		{
			String nq=que.substring(0,i)+que.substring(i+1);
			permutation(nq,ans+que.charAt(i));
		}
	}

}
