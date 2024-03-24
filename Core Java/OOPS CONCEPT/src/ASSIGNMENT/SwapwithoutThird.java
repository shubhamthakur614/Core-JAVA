package ASSIGNMENT;

public class SwapwithoutThird {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a + " " + b);
		swapInteger(a, b);
		// swap two String string
		String s1 = "abc";
		String s2 = "def";
		System.out.println(s1 + " " + s2);
		swapString(s1, s2);

	}

	public static void swapInteger(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);
	}

	public static void swapString(String s1, String s2) {

		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println(s1 + " " + s2);
	}

}
