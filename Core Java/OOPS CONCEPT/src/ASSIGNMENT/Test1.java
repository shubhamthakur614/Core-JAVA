package ASSIGNMENT;

public class Test1 {

	public static void main(String[] args) {

		String input = "my name is shubham";
		String reversed = reverseWords(input);
		System.out.println("Input: " + input);
		System.out.println("Output: " + reversed);
	}

	public static String reverseWords(String input) {
		char[] characters = input.toCharArray();
		int start = 0;
		int end = characters.length - 1;

		// Reverse the entire string
		reverseCharacters(characters, start, end);

		// Reverse individual words
		start = 0;
		for (int i = 0; i < characters.length; i++) {
			if (characters[i] == ' ' || i == characters.length - 1) {
				end = (i == characters.length - 1) ? i : i - 1;
				reverseCharacters(characters, start, end);
				start = i + 1;
			}
		}

		return new String(characters);
	}

	private static void reverseCharacters(char[] characters, int start, int end) {
		while (start < end) {
			char temp = characters[start];
			characters[start] = characters[end];
			characters[end] = temp;
			start++;
			end--;
		}
	}
}
