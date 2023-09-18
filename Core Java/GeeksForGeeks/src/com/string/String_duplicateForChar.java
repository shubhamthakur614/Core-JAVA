package com.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class String_duplicateForChar {
	public static void main(String[] args) {
		String s = "javaj2ee";
		Map<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < s.length(); i++) 
		{
			char c = s.charAt(i);
			if (hm.get(c) != null) {
				hm.put(c, hm.get(c) + 1);

			} else {
				hm.put(c, 1);
			}
		}
		Iterator <Character>c=hm.keySet().iterator();
		while(c.hasNext())
		{
			Character key=c.next();
			if(hm.get(key) >1)
			{
				System.out.print(key+""+hm.get(key));
			}
		}

	}

}
