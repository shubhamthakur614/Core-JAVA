package BST_problem;
//to find floor return end as i is less than actual no
public class _2floor_of_No {
	public static void main(String[] args) 
	{
		int[] arr= {2,5,9,14,20,29};
		int target=1;
		System.out.println(ceiling(arr,target));
	}
	public static int ceiling(int[] arr,int target)
	{
		//if no is less than all no present inside array actually we dont need to 
//		provid this but just for understanding i am providing for floor
		if(target<arr[arr.length-1])
		{
			return -1;
		}
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
		
		return end;
	}
}
