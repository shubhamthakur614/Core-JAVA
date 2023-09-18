package com.Collection.Set_TreeSet;

import java.util.TreeSet;

public class TreeSetFullDemo {
	public static void main(String[] args) {

		// HOW TO ADD AND POLLFIRST AND POLLLAST METHOD
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("SHUBHAM");
		ts.add("VIRAJ");
		ts.add("BHAVANA");
		ts.add("JAGRUTI");
		System.out.println(ts);

		System.out.println("POLL FIRST(): " + ts.pollFirst());
		System.out.println("POLL LAST(): " + ts.pollLast());

		// VARIOUS NAVIGABLESET OPERATIONS.

		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("A");
		ts1.add("B");
		ts1.add("E");
		ts1.add("F");
		ts1.add("D");
		ts1.add("C");
		//FOR INITIAL SET
		System.out.println("INITIAL SET:" + ts1);
		// FOR REVERSE SET
		System.out.println("REVERSE SET: " + ts1.descendingSet());
		// HEAD SET
		System.out.println("HEAD SET: " + ts1.headSet("D"));
		System.out.println("HEAD SET EXCEPT D: " + ts1.headSet("D", false));
		System.out.println("HEAD SET INCLUDING D: " + ts1.headSet("D", true));
		// TAIL SET
		System.out.println("TAIL SET: " + ts1.tailSet("B"));
		System.out.println("TAIL SET INCLUDING B: " + ts1.tailSet("B", true));
		System.out.println("TAIL SET EXCEPT B: " + ts1.tailSet("B", false));
		//SUB SET
		System.out.println("SUB SET:"+ts1.subSet("B", "E"));
		System.out.println("SUB SET WITHOUT B AND WITH E:"+ts1.subSet("B",true, "E",false));
		System.out.println("SUB SET WITH B AND WITHOUT E:"+ts1.subSet("B",false, "E",true));
		
		

	}
}