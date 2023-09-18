package Sorting;
/*
 * int[] a= { 12, 10, 5, 17, 4, 19 };
 *     { 12}  ||   { 10, 5, 17, 4, 19 };
 *   sorted ||  unsorted
 *   temp=a[i];//temp=10;
 *     { 12}  ||   {  , 5, 17, 4, 19 };//temp=10;
 *   j=i-1;//0
 *   while(j>=0 && a[j]>temp)
 *   {
 *     a[j+1]=a[j]//a[0+1]=a[0]
 *     j--//j=0-1=-1
 *   }
 *    a[j+1]=temp//a[-1+1]=a[0]put value of temp;
 *     { 10} { 12} || { 5, 17, 4, 19 };
 *   
 * 
 */

public class Insertion_sort 
{
	public static void main(String[] args)
	{
		int[] a= { 12, 10, 5, 17, 4, 19 };
		for(int i=1;i<a.length-1;i++)
		{
			int temp=a[i];//temp=10;
			int j=i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		//printing
		for(int z:a)
		{
			System.out.print(z+" ");
		}
		
	}

}
