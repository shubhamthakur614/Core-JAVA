package com.Static_keyword;

class Stat {
	static int i = 0;// when ever you make a variable static it get memory only in runtime once;
	// int i=0;//we get op of 1,1,1 every time new memory is allocated during object
	// creation

	Stat() {
		i++;
		System.out.println(i);
	}
}

public class Static_demo {
	public static void main(String[] args) {

		Stat s = new Stat();
		Stat s1 = new Stat();
		Stat s2 = new Stat();

	}

}
