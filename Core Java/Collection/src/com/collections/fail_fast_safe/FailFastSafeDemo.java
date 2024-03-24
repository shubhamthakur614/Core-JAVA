package com.collections.fail_fast_safe;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastSafeDemo {

	public static void main(String[] args) {
//		List<String> fruit = new ArrayList<>();
		List<String> fruit = new CopyOnWriteArrayList<>();

		fruit.add("Banana");
		fruit.add("Apple");
		fruit.add("Pineapple");

		Iterator<String> itr = fruit.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			if (!fruit.contains("Mango")) {
				fruit.add("Mango");
			}

//			fruit.remove("Apple");
		}
		System.out.println(fruit);

	}
}
