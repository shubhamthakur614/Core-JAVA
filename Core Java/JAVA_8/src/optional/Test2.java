package optional;

/*
 * Sample Input String : "  Jiem India Pvt Ltd    "
  Expected Output : "Jiem India Pvt Ltd"
 */
public class Test2 {
	public static void main(String[] args) {

		pattern(5);
		String s = "  Jiem India Pvt Ltd    ";
		trimMethod(s);

	}

	public static void trimMethod(String s) {

		int start = 0;
		int end = s.length() - 1;

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(start) == ' ') {
				start++;

			}
			if (s.charAt(end) == ' ') {
				end--;
			}

		}
		System.out.println(start);
		System.out.println(end);
		System.out.println(s.substring(start, ++end));
	}

	public static void pattern(int n) {

		for (int i = 0; i < n; i++) {

//			if (i % 2 == 0) // even
//			{
//				System.out.print(" ");
//				System.out.print("*");
//				System.out.print(" ");
//
//			} else if (i % 2 != 0) {
//
//				System.out.print("*");
//				System.out.print(" ");
//				System.out.print("*");
//
//			}
//			System.out.println();

			for (int j = 0; j < 3; j++) {
				if (i % 2 == 0) // even
				{
					System.out.print(" ");

				}

				else if (i % 2 != 0) {

					System.out.print("");

				}
			}

		}

	}

}
