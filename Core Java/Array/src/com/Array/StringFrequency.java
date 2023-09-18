package com.Array;

import java.util.HashMap;
import java.util.Map;

public class StringFrequency {
	public static void main(String[] args) {
		String s = "Geeks For Geeks";
		frequency(s);
	}

	public static void frequency(String s) {
		Map<Character, Integer> m = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (m.get(s.charAt(i)) == null) {
				m.put(s.charAt(i), 1);
			} else {
				m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			// to not get same value again
			if (s.charAt(i)!=' '&& m.get(s.charAt(i)) != 0) {
				System.out.print(s.charAt(i));
				System.out.print(m.get(s.charAt(i)));
				m.put(s.charAt(i), 0);

			}
		}

	}
	
}
