
package com.CollectionList;
import java.util.*;
//write a program to check the symbol parenthesis matching

public class symbolBalanced 
{
	public static void main(String[] args) 
	{
		String expre="{([]{})}";
		if(isSymbolBalanced(expre))
		{
			System.out.println("BALANCED");
		}
		else
		{
			System.out.println("NOT BALANCED");
		}
		
	}
	
	static boolean isSymbolBalanced(String exper)
	{
		//declaring Array deque it is faster than the stack
		Deque<Character>stack=new ArrayDeque<>();
		
		
		for(int i=0;i<exper.length();i++)
		{
			char x=exper.charAt(i);
			if(x=='('||x=='{'||x=='[')
			{
				stack.push(x);
				continue;
			}
			
			// If current character is not opening
			// bracket, then it must be closing. So stack
			// cannot be empty at this point.
			
			if(stack.isEmpty())
			{
				return false;
			}
			char check;
			
			switch(x)
			{
				case ')':
				{
					check=stack.pop();
					if(x=='{'|| x=='[')
					{
						return false;
						
					}
					break;
					
				}
				case '}':
				{
					check=stack.pop();
					if(x=='('|| x=='[')
					{
						return false;
						
					}
					break;
					
				}
				case ']':
				{
					check=stack.pop();
					if(x=='{'|| x=='(')
					{
						return false;
						
					}
					break;
					
				}
			
			}
			
		}
		return (stack.isEmpty());
		
	}

}
