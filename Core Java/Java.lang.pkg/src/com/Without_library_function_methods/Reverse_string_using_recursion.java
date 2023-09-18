package com.Without_library_function_methods;

public class Reverse_string_using_recursion {
	public static void main(String[] args) {
		String s = "shubham anant thakur";
		reverse(s);

	}

	public static void reverse(String s) {
		if (s == null || s.length() <= 1) {
			System.out.println(s);

		}

		else {
			System.out.print(s.charAt(s.length() - 1));
			reverse(s.substring(0, s.length() - 1));

		}

	}

}
