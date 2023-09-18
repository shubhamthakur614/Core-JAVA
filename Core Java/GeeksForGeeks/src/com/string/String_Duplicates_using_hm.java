package com.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class String_Duplicates_using_hm
{
	public static void main(String[] args) 
	{
		String s="i am am very good good guy";
		String[] sp=s.split(" ");
		
		Map<String,Integer>hm=new HashMap<>();
		for(String temp:sp)
		{
			if(hm.get(temp)!=null)
			{
				hm.put(temp, hm.get(temp)+1);
				
			}
			else
			hm.put(temp, 1);
		}
		
		Iterator<String>temp=hm.keySet().iterator();
		while(temp.hasNext())
		{
			String key=temp.next();
			if(hm.get(key)>1)
			{
				System.out.println(key+" : "+hm.get(key));
			}
		}
		
		
		
	}

}
