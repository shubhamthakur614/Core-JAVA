package BST_problem;

/*
ex: input arr={2,5,9,14,20,29} target=9;

o/p 9 becz the no found in the array
ceiling no=no equal to target or greter than targett but smallest small near to target

ex:arr={2,5,9,14,20,29} target=10;
o/p 14;
to find ceiling return start as when while condition fail start greater than end and we get ceiling


*/

public class _1Ceiling_of_No {
	public static void main(String[] args) 
	{
		int[] arr= {2,5,9,14,20,29};
		int target=10;
		System.out.println(ceiling(arr,target));
	}
	public static int ceiling(int[] arr,int target)
	{
		//what if target no is greter than all no present inside array
		if(target>arr[arr.length-1])
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
		
		return start;
	}

}
