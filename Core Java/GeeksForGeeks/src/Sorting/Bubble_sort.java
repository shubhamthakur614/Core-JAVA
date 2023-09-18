package Sorting;

public class Bubble_sort {
	public static void main(String[] args) {
		int[] a = { 1,2,4,5,3};

		for (int i = 0; i < a.length; i++)//i=0,i<5;i++
		{
			
			boolean swapped=false;
			for (int j = 0; j < a.length - i - 1; j++) 
			{
				if (a[j] > a[j + 1]) 
				{
					swapped=true;
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;

				}

			}

			if(swapped==false)//(!=swapped)
			{
				break;
			}
		}
		for(int z:a)
		{
			System.out.print(z+" ");
		}

	}


}
