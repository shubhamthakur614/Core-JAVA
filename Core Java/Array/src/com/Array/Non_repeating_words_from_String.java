package com.Array;

import java.util.HashMap;
import java.util.Map;

//remove the non repeating element and only print the element who appear 
//only onces
// i/p String s="test test test pass";
// o/p pass

public class Non_repeating_words_from_String {
	public static void main(String[] args) {
		String s = "i love my india i love my food as well";
		Non_rep_char(s);

	}

	public static void Non_rep_char(String s) {
		// using hashmap
		Map<String, Integer> hm = new HashMap<>();
		String[] str_arr = s.split(" ");

		for (String str : str_arr) {
			Integer count = hm.get(str);

			if (count == null) {
				hm.put(str, 1);
			} else {
				hm.put(str, ++count);
			}
		}

		for (int i = 0; i < str_arr.length; i++) {
			if (hm.get(str_arr[i]) <= 1) {
				System.out.print(str_arr[i] + " ");
			}
		}

	}

}
