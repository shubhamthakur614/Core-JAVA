
public class Factorial {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(Facto(n));

	}

	public static int Facto(int n) {

		if (n == 0) {
			return 1;
		}
		return n*Facto(n-1);

	}

}
