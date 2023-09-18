package com.string;

import java.util.HashSet;
import java.util.Set;

//remove the duplicate from string 

//Ex: "aabbccddedf";
//op "avcdef";

public class _RemoveDuplicateFromString {
	public static void main(String[] args) {
		String s = "aabccdeffd";
		repeted1(s);
		repeted2(s);
		repeted3(s);

	}

	// using normal bruteforce approach by O(n^2);
	public static void repeted1(String s) {
		char[] c = s.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < c.length; i++) {
			boolean repated = false;
			for (int j = i + 1; j < c.length; j++) {

				if (c[i] == c[j]) {
					repated = true;
					break;
				}
			}
			if (!repated) {
				sb.append(c[i]);
			}
		}
		System.out.println(sb);

	}

	// by using index of method of string class
	public static void repeted2(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int idx = s.indexOf(c, i + 1);// if found then return else -1 return

			if (idx == -1) {
				sb.append(c);
			}
		}
		System.out.println(sb);

	}

	// by using Set O(n);
	public static void repeted3(String s) 
	{
		Set<Character>set=new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		//to  print 
		for(Character cc:set)
		{
			System.out.print(cc);
		}

	}
}
