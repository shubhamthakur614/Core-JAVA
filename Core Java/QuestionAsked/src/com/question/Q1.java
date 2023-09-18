package com.question;
//deloteee question to find the frequency of string and then from frequency
// find if frequency of count is prime or not if yes then in x and and iny do multiply
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Q1 {
	public static void main(String[] args) {
		String str = "abcdefabcdefabcdefabcdefabcdef";
		primeCal(str);

	}

	public static void primeCal(String str) {
		int x = 0;
		int y = 1;
		Map<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Integer count = hm.get(str.charAt(i));
			if (count == null) {
				hm.put(str.charAt(i), 1);
			} else {
				hm.put(str.charAt(i), ++count);
			}
		}
		Set<Entry<Character, Integer>> entrySet = hm.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (isPrime(entry.getValue())) {
				x += entry.getValue();
				y *= entry.getValue();
			}
		}
		System.out.println("X: " + x + "," + "Y: " + y);
	}

	public static boolean isPrime(int no) {
		int flag = 1;
		if (no <= 1) {
			return false;
		} else {
			for (int i = 2; i < no; i++) {
				if (no % i == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				return true;
			} else {
				return false;
			}
		}
	}
}
