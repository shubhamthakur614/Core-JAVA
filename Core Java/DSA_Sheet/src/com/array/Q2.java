package com.array;

//reverse a string 
//s = Geeks
//Output: skeeG

public class Q2 {
	public static void main(String[] args) {
		String str = "Geeks";
		System.out.println(str);
		String reverseWord = reverseWord(str);
		System.out.println(reverseWord);

	}

	public static String reverseWord(String str) {
		// Reverse the string str
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}
}
