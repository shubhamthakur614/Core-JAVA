package com.Array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Frequency_String {
	public static void main(String[] args) {
		String name = "geeks for geeks";
		String[] split = name.split(" ");
		Map<String, Integer> hm = new LinkedHashMap<>();
		for (int i = 0; i < split.length; i++) {
			if (split[i] != " ") {
				Integer count = hm.get(split[i]);
				if (count == null) {
					hm.put(split[i], 1);
				} else {
					hm.put(split[i], ++count);
				}

			}
		}
		Set<Entry<String, Integer>> entrySet = hm.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.print(entry.getKey() + ":");
			System.out.println(entry.getValue());
		}
	}

}
