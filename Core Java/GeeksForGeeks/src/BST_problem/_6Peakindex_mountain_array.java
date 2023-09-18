package BST_problem;

public class _6Peakindex_mountain_array 
{
	public static void main(String[] args) {
		
	
	int[] arr= {1,2,3,4,1,0};
	System.out.println(peakindex(arr));
	
	}	
	public static int peakindex(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1])
			{
				end=mid;
			}
			else
			{
				start=mid+1;
			}
		}
		return start;
		
	}
}
