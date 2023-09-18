
public class Fibo_recursion {
	static int a = 0, b = 1, c;

	public static void main(String[] args) {
		System.out.print(a + " " + b);
		printFibo(10);

	}

	public static void printFibo(int n) 
	{

		if (n >= 1) 
		{
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
			printFibo(n - 1);
		}

	}

}
