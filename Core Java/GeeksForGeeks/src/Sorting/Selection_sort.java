package Sorting;

//o(n^2);time complexity
public class Selection_sort 
{
	public static void main(String[] args)
	{
		int[] arr = { 4, 1, 36, 2, 3, 6 };
		
		for(int i=0;i<arr.length-1;i++)
		{
			int min=i;
			//its index not actual value at arr[i]=4;its only store arr[0]index not value of 0.
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
				
			}
			if(min!=i)
			{
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
			
		}
		for(int Z:arr)
		{
			System.out.print(Z+" " );
		}
		
	}

}
