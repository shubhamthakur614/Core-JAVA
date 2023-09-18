package ASSIGNMENT;

public class FiboBetween {
	public static void main(String[] args) {
		int start = 10;
		int end = 100;
		int a = 0;
		int b = 1;
		int temp = 0;
		while(a<=end)
		{
			if(a>=start)
			{
				System.out.print(a+" ");
			}
			temp=a+b;
			a=b;
			b=temp;
		}

		

	}

}
