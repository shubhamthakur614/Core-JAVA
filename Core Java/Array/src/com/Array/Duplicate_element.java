package com.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//there are three methods 
//bruteforce O(n^2);
//using abs method this method going to modify array if you dont allow to modifyO(n)
//using hashset approach O(n);
// Hash map (best solution);O(n)
//

public class Duplicate_element {
	public static void duplicate1(String[] arr) {
		System.out.println(" using Bruteforce Method:");
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("Dont find any Duplicates:");
		}
	}

	public static void duplicate2(int[] arr2) {
		System.out.println("\n Using Abolute Method: ");
		for (int i = 0; i < arr2.length; i++) {
			// if it is negative make postive
			// if positive make negative
			if (arr2[Math.abs(arr2[i])] > 0) {
				// if positive make negative
				arr2[Math.abs(arr2[i])] = -arr2[Math.abs(arr2[i])];

			} else {
				System.out.print(Math.abs(arr2[i]) + " ");
			}
		}
	}

	public static void duplicate3(int[] arr3) {
		System.out.println("\n Using Hashset:");
		// here we are using hash set it dosent take duplicate so print false

		Set<Integer> s = new HashSet<>();

		for (int ab : arr3) {
			if (s.add(ab) == false) {
				System.out.print(ab + " ");
			}
		}
	}

	public static void duplicate4(int[] arr4) {
		System.out.println("\n Using HashMap: ");
		Map<Integer, Integer> hm = new HashMap<>();
		// using enhanced for loop
		for (Integer digit : arr4) 
		{
			Integer count = hm.get(digit);// it return null by default ntg is there
			if (count == null) {
				hm.put(digit, 1);
			}
			else
			{
				hm.put(digit, ++count);
			}
		}
		//for getting result from hashmap we use entry set
		   
		    Set<Entry<Integer,Integer>> entryset =hm.entrySet();
		    //Again enhanced for loop
		    for(Entry<Integer,Integer> entry:entryset)
		    {
		    	if(entry.getValue()>1)
		    	{
		    	  System.out.print(entry.getKey()+" ");	
		    		
		    		 
		    	}
		    }
		    
	}

	public static void main(String[] args) {
		String[] arr = { "Shubham", "Ravi", "Shubham", "Pankaj", "payal", "Pankaj" };
		duplicate1(arr);
		int[] arr2 = { 1, 2, 1, 3, 5, 6, 2, 7, 3, 9 };
		duplicate2(arr2);
		int[] arr3 = { 1, 2, 1, 3, 5, 6, 2, 7, 3, 9 };
		duplicate3(arr3);
		int[] arr4 = { 1, 2, 1, 3, 5, 6, 2, 7, 3, 9,1,2,1 };
		duplicate4(arr4);

	}

}
