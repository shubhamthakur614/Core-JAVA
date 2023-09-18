package String_programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static boolean isAnagram1(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		} else {
			char[] c = s1.toCharArray();
			char[] c1 = s2.toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c);

			return Arrays.equals(c, c1);
		}

	}

	public static boolean isAnagram2(String s1, String s2) {
		Map<Character, Integer> m = new HashMap<>();
		Map<Character, Integer> m1 = new HashMap<>();

		for (int i = 0; i < s1.length(); i++) {
			if (m.get(s1.charAt(i)) == null) {
				m.put(s1.charAt(i), 1);
			} else {
				m.put(s1.charAt(i), m.get(s1.charAt(i)) + 1);
			}
		}

		for (int i = 0; i < s1.length(); i++) {
			if (m1.get(s2.charAt(i)) == null) {
				m1.put(s2.charAt(i), 1);
			} else {
				m1.put(s2.charAt(i), m1.get(s2.charAt(i)) + 1);
			}
		}

		return m1.equals(m);

	}

	public static void main(String[] args) {
		String s1 = "LISTEN";
		String s2 = "SILENT";

		if (isAnagram2(s1, s2)) {
			System.out.println("String is Anagram");

		} else {
			System.out.println("Not Anagram");
		}

	}

}
