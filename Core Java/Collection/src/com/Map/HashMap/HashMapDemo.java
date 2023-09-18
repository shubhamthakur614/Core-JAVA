package com.Map.HashMap;

import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		// hashmap empty constructor

		HashMap h = new HashMap();
		// putting keys and values into constructor using put method
		h.put(100, "SHUBHAM");
		h.put(110, "SNEHA");
		h.put(116, "VIVEK");
		h.put(104, "KANCHAN");
		h.put(500, "BABITA");

		System.out.println(h);
		// if we duplicate the key the old key value is return and new value assign to
		// the key
		System.out.println(h.put(104, "KARISHMA"));

		// Entry specific method to get only keys
		Set s = h.keySet();
		System.out.println(s);
		// get only values
		Collection c = h.values();
		System.out.println(c);
		// get only key value pairs
		Set s1 = h.entrySet();
		System.out.println(s1);

		// if we want the values one by one use cursor
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + " " + m1.getValue());
			if (m1.getKey().equals(500)) {
				m1.setValue("Pallavi");
			}
		}
		System.out.println(h);

	}

}
