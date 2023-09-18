package com.Collection.Set_Hashset;

import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add(10);
		h.add(null);
		h.add("B");// b is not printing becz the duplication is not allowed

		System.out.println(h.add("A"));
		System.out.println(h);

	}

}
