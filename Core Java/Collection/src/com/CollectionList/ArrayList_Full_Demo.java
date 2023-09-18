package com.CollectionList;

import java.util.ArrayList;

public class ArrayList_Full_Demo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// add method
		al.add("Shubham");
		al.add(1, "Ankita");
		al.add(2, "Prachi");
		al.add("Vaishnavi");
		// printing using normal method

		System.out.println("ADD METHOD:" + al);
		al.removeIf(str -> str.contains("Prachi"));
		System.out.println("remove if method:" + al);
		// addAll method
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Coconut");
		al1.add("BANANA");
		al1.add("Apple");

		// al1.addAll(al);//for general addAll method
		al1.addAll(1, al);
		System.out.println("addAll method at perticular index: " + al1);

		// get and set method
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("ALTO");
		al2.add("BREZZA");
		al2.add("CRETA");
		al2.add("AMAZE");
		System.out.println("LIST: " + al2);
		System.out.println("TO GET VALUE AT PERTICULAR INDER NO:" + al2.get(2));
		al2.set(0, "AUDI");
		System.out.println("SETTING AT PERTICULAR INDEX:" + al2);

		// remove and removeAll and RemoveIf
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(10);
		al3.add(11);
		al3.add(12);
		al3.add(13);
		al3.add(14);
		al3.add(15);
		System.out.println("LIST :" + al3);
		al3.remove(4);
		System.out.println("REMOVE METHOD through Index:" + al3);

		// we have removeALL();
		// and clear();

		// retainAll()
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("GULABJAAM");
		al4.add("PEDHA");
		al4.add("RASAGULLA");

		ArrayList<String> al5 = new ArrayList<String>();
		al5.add("PANIPURI");
		al5.add("SPDP");
		al4.addAll(al5);
		System.out.println(al4);
		al4.retainAll(al5);
		System.out.println("RETAIN ALL" + al4);

		// isEmpty()

		ArrayList<String> al6 = new ArrayList<String>();
		System.out.println(" isEmpty METHOD:" + al6.isEmpty());
		al6.add("SHUBHAM");
		System.out.println(" isEmpty METHOD:" + al6.isEmpty());

		// contains and containsAll

		ArrayList<String> al7 = new ArrayList<String>();
		al7.add("AKSHRA");
		al7.add("SHIKHA");
		al7.add("PALAVI");
		al7.add("SHREYA");
		al7.add("SHIVANGI");
		al7.add("PAYAL");

		if (al7.contains("SHREYA")) {
			System.out.println("LIST WILL CONTAINS SHREYA AT INDRX:" + al7.indexOf("SHREYA"));
		} else {
			System.out.println("NO RESULT FOUND !!!!!!");
		}

	}

}
