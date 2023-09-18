package com.CollectionList;
import java. util.*;

public class List_Iterator_Demo {
	public static void main(String[] args) {
		List<String> l = new LinkedList<String>();
		l.add("Karishma");
		l.add("Shreya");
		l.add("Sneha");
		l.add("Pratiksha");

		System.out.println(l);

		// using the list iterator

		ListIterator<String> itr = l.listIterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			if (s.equals("Sneha")) {
				itr.add("Bebo");
			} else if (s.equals("Karishma")) {
				itr.remove();
			} else if (s.equals("Pratiksha")) {
				itr.set("Pratu");
			}

		}
		System.out.println(l);

	}
}
