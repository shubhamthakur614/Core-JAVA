package Sorting;

public class marge_Sorting 
{
	
	public static void  marge(int[] arr,int l,int mid,int r)
	{
		int i=l;
		int j=mid+1;
		int k=l;
		int[] b=new int[arr.length];
		while(i<=mid && j<=r)
		{
			if(arr[i]<arr[j])
			{
			  b[k]=arr[i];
				i++;
			}
			else
			{
				b[k]=arr[j];
				j++;
				
			}
			k++;
		}
		if(i>mid)
		{
			while(j<=r)
			{
				b[k]=arr[j];
				j++;
				k++;
			
			}
		}
		else
		{
			while(i<=mid)
			{
				b[k]=arr[i];
				i++;
				k++;
			}
		}
		
		for(int z=l;z<=r;z++)
		{
			arr[z]=b[z];
		}
		
	}
	
	public static void sort(int[] arr,int l,int r)
	{
		if(l<r)
		{
			int mid=(l+r)/2;
			sort(arr,l,mid);
			sort(arr,mid+1,l);
			marge(arr,l,mid,r);
		}
		
		
	}
	public static void print(int[] arr)
	{
		for(int s:arr)
		{
			System.out.print(s+" ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {15,5,24,8,1,3,16,10,20};
		int n=arr.length;
		sort(arr,0,n-1);
		print(arr);
		
		
		
	}

}
