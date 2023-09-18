package Searching;
//time complexity  is O(log2 n)
public class BinarySearch {
	public static void main(String[] args) 
	{
		int[] arr= {4,9,10,14,20,24,25,47,68};
		int target=25;
		System.out.println("Element present in index: "+BS(arr,target));
	}
	public static int BS(int[] arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]<target)
			{
				start=mid+1;
			}
			else if(arr[mid]>target)
			{
				end=mid-1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
		
	}
}
		