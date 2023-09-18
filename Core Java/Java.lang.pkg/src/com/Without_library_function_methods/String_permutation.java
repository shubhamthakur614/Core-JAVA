
package com.Without_library_function_methods;

public class String_permutation {
	public static void main(String[] args) {
		int count = 0;
		String s = "abc";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
				count++;
			}
		}
		System.out.println(count);

	}

}
