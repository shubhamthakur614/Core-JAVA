package test1;

public class Test {
	public static void main(String[] args) {
		int decimalNumber = 10; // Change this to the decimal number you want to convert
		String binary = recursionDTB(decimalNumber);
		System.out.println("Binary representation: " + binary);
	}

	public static String recursionDTB(int decimalNumber) {

		if (decimalNumber == 0)
			return "";

		String recursionDTB = recursionDTB(decimalNumber / 2);

		int s = decimalNumber % 2;

		return recursionDTB + s;

	}
}
