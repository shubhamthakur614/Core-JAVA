/*The super keyword in Java is a reference variable which is used 
 * to refer immediate parent class object.
  Whenever you create the instance of subclass, an instance of
 parent class is created implicitly which is referred by super reference variable.
 */

package com.Super;

class Su {
	int i;
	String name;

	void show(int i, String n) {
		this.i = i;
		this.name = n;

	}
}

class Per extends Su {
	float sal;

	void show(int i, String name, float sal) {

		super.show(i, name);
		System.out.println(i + " " + name + "" + sal);

	}
}

public class Super_demo {
	public static void main(String[] args) {
		Per p = new Per();
		p.show(1, "shubham", 14.12f);

	}

}
