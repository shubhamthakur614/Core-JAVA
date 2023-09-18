package com.String;
//two way of doing that 

//1) directly using method Integer.toBinaryString(int value);
//2)Using custom logic
//same logic for octal nad hexadecimal also

public class Decimal_to_Binary {
	public static void main(String[] args) {
		int Number = 10;
		System.out.println("Binary Representation of " + Number + "  is " + Integer.toBinaryString(Number));
		binary(Number);
		
		

		
	}

	public static void binary(int Number) {
		int[] binary = new int[20];
		int i = 0;

		while (Number != 0) {
			binary[i] = Number % 2;//
			Number = Number / 2;//
			i++;

		}
		
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(binary[j]);
		}
		

		
	}

}
