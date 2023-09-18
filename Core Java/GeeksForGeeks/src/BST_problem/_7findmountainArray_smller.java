package BST_problem;
/*
 * if you have array like arr={1,2,3,4,5,3,1} target=3;
 * o/p 2 becz we have to find smallest index no target
 * 
 * 
 * 1)first find peak
 * 2)tend in left side bs then in right side bs from index 0 to peak
 * element and fron in rightfrom pick +1 to last(ordaer agnostic)
 */

public class _7findmountainArray_smller {
	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5,3,1,9};
//		int[] arr= {4,5,6,7,0,1,2}; target =0
		int target = 3;
		System.out.println(MainMethod(arr,target));

	}

	// main method return to main
	public static int MainMethod(int[] arr, int target) 
	{
		int peak = peakElement(arr, target);
		int firsthalf=orderAgnostic(arr,target,0,peak);
		if(firsthalf!=-1)
		{
			return firsthalf;
		}
		return orderAgnostic(arr,target,peak+1,arr.length-1);

	}

//	for main finding binary sear using agnostic
	public static int orderAgnostic(int[] arr,int target,int start,int end)
	{
		
		boolean ordertype=arr[start]<arr[end];
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			//for ascending order
			if(ordertype)
			{
				if(target>arr[mid])
				{
					start=mid+1;
				}
				else
				{
					end=mid-1;
				}
				
			}
			//for descending order
			else
			{
				if(target>arr[mid])
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
			
		}
		return -1;
		
	}

	// to return peak
	public static int peakElement(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;

	}

}
