package ASSIGNMENT;

//normal and Recursive way
public class DecimalToBinary {
	public static void main(String[] args) {
		int decimalNumber = 10; // Change this to the decimal number you want to convert
		String binary = convertToBinary(decimalNumber);
		System.out.println("Binary representation: " + binary);
		System.out.println(convertToBinaryRecursively(decimalNumber));

	}

	public static String convertToBinary(int decimalNumber) {
		if (decimalNumber == 0) {
			return "0"; // Special case for input 0
		}

		StringBuilder binary = new StringBuilder();

		while (decimalNumber > 0) {
			int remainder = decimalNumber % 2; // Get the remainder when dividing by 2
			binary.insert(0, remainder); // Prepend the remainder to the binary string
			decimalNumber /= 2; // Divide the number by 2 for the next iteration
		}

		return binary.toString();
	}

	public static String convertToBinaryRecursively(int decimalNumber) {

		if (decimalNumber == 0)
			return "";

		String divideNo = convertToBinaryRecursively(decimalNumber / 2);
		int rem = decimalNumber % 2;
		return divideNo + rem;
	}
}
