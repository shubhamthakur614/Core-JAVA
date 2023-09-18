package Pattern;

public class Pascale_triangle {
	public static void main(String[] args) {

		int n = 10;

		for (int i = 0; i < n; i++) 
		{
			for(int z=n;z>i;z--)
			{
				System.out.print(" ");
			}
			int p=1;
			for (int j = 0; j <= i; j++) 
			{
              System.out.print(p+" ");
              //actual logic to print and add
              int temp=p*(i-j)/(j+1);
              p=temp;
			}
			System.out.println();
		}

	}
}
