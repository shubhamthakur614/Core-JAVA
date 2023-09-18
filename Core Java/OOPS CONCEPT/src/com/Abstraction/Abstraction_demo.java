package com.Abstraction;

abstract class Bank {
	public void deposit() {
		System.out.println("DEPOSITING TO BANK!!!!!!!!!!!!!!!!!!!");
	}

	public void withdraw() {
		System.out.println("WITHDRAW FROM BANK!!!!!!!!!!!!!!!!!!");
	}

	abstract public void interest();

}

class Hdfc extends Bank {
	public void interest() {
		System.out.println("HDFC BANK HAS 4.5% RATE OF INTEREST!!!!!!!");
	}

}

class Sbi extends Bank {
	public void interest() {
		System.out.println("SBI BANK HAS 8.2% RATE OF INTEREST!!!!!!!!");
	}
}

public class Abstraction_demo {
	public static void main(String[] args) {
        
		Bank hdfc=new Hdfc();
		hdfc.interest();
		
		Bank sbi=new Sbi();
		sbi.interest();
	}

}
