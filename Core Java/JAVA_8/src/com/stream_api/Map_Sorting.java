package com.stream_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Sorting {
	public static void main(String[] args) {
//		Normal Way
		Map<String, Integer> m = new HashMap<>();
		m.put("z", 1);
		m.put("b", 4);
		m.put("a", 1);
		m.put("d", 3);

		// as collection.sort method always require list so convert map to list

		List<Entry<String, Integer>> list = new ArrayList<>(m.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				return o1.getKey().compareTo(o2.getKey());
			}

		});

		// print the map
		for (Entry<String, Integer> e : list) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		// how we can sort the data in map using lambda

		Map<String, Integer> m1 = new HashMap<>();
		m1.put("z", 1);
		m1.put("b", 4);
		m1.put("a", 1);
		m1.put("d", 3);
		List<Entry<String, Integer>> l1 = new ArrayList<>(m1.entrySet());
		Collections.sort(l1, (a, b) -> a.getKey().compareTo(b.getKey()));
		l1.forEach(z -> System.out.println(z.getKey() + " " + z.getValue()));
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		
		// using stream Api
		Map<String, Integer> m2 = new HashMap<>();
		m2.put("z", 1);
		m2.put("b", 4);
		m2.put("a", 1);
		m2.put("d", 3);
		//we dont need to convert in list
		m2.entrySet().stream().sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey())).forEach(System.out::println);
System.out.println("///////////////////////////");

		//even though we dont have to right logic as well
		m2.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}

}
