package com.interview.question;

//reverse string without affecting the special character

public class Q8 {
	public static void main(String[] args) {
		String input = "r#aa$p1id";
		System.out.println(input);
		String output = reverseStringWithSpecialChars(input);
		System.out.println(output); // Output: "d#ip$aar"
		System.out.println(reverseStringWithSpecialChars1(input));
	}

	// using bydefault method of string Chracter.isLetter();
	public static String reverseStringWithSpecialChars(String s) {
		int start = 0;
		char[] c = s.toCharArray();
		int end = s.length() - 1;
		while (start < end) {
			if (!Character.isLetter(s.charAt(start))) {
				start++;
			} else if (!Character.isLetter(s.charAt(end))) {
				end--;
			} else {
				char temp = c[start];
				c[start] = c[end];
				c[end] = temp;
				start++;
				end--;
			}

		}
		return new String(c);
	}

//	writing logic for special character
	public static String reverseStringWithSpecialChars1(String s) {
		int start = 0;
		char[] c = s.toCharArray();
		int end = s.length() - 1;
		while (start < end) {
			if (!isValid(c[start])) {
				start++;
			} else if (!isValid(c[end])) {
				end--;
			} else {
				char temp = c[start];
				c[start] = c[end];
				c[end] = temp;
				start++;
				end--;
			}

		}
		return new String(c);
	}

	public static boolean isValid(char c) {
		return (((c >= 'a') && (c <= 'z')) || (c >= 'A') && (c <= 'Z')) || ((c >= '0') && c <= '9');
	}

}
