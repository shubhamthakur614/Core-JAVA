package BST_problem;

/*
 * if we dont know the position of array as we dont use arr,length then
 * we have to use boxing and then doubling the size
 *
 * 
 */

public class _5PositionOf_infiniteArray 
{
	public static void main(String[] args)
	{
		int[] arr= {2,4,6,7,10,14,16,18,19};
		int target=16;
		System.out.println(findposition(arr, target));
		
	}
	public static  int findposition(int[] arr,int target)
	{
		int start=0;
		int end=1;
		//if target is greater than end then dont search at back just double 
//		the size
		while(target>arr[end])
		{
			int newstart=end+1;
			//to double the boxing
			end=(end-start+1)*2;
			start=newstart;
		}
		return bst(arr,target,start,end);
	}
	public static int bst(int[] arr,int target,int start,int end)
	{

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


