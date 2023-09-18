
package com.Exception_handling;

import java.util.Scanner;

class AgeoutofException extends RuntimeException {
	public AgeoutofException(String n) {
		super(n);

	}

}

class Voting {
	public void vote(int age) {
		if (age < 18) {
			throw new AgeoutofException("YOU ARE NOT ELIGIBLE FOR VOTE");
		} else {
			System.out.println("YOU CAN VOTE:");
		}

	}
}

public class Throw_keyword {
	public static void main(String[] args) {
		System.out.println("ENTER THE AGE:");
		Scanner s = new Scanner(System.in);

		try {
			int age = s.nextInt();
			Voting v = new Voting();
			v.vote(age);

		} catch (AgeoutofException e) {
			e.printStackTrace();
		}

	}

}
