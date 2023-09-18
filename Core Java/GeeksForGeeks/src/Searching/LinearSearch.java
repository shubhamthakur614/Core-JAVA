package Searching;

//its time complexity is O(n)
public class LinearSearch 
{
	public static int search(int[] arr,int n,int key)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] arr= {15,24,1,9,5,36,3};
		int key=3;
		int n=arr.length;
		int result=search(arr,n,key);
		System.out.println("Key found in Index:"+result);
		
	}

}
