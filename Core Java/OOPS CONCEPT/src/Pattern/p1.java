package Pattern;

public class p1 
{
	public static void main(String[] args) {
		int num=8;
		for(int i=1;i<=8;i++)
		{
			//for space logic
			for(int j=0;j<num-i;j++)
			{
				System.out.print(" ");
			}
			//half printing logic
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			//remaing half logic less than i
			for(int l=i-1;l>0;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}

}
