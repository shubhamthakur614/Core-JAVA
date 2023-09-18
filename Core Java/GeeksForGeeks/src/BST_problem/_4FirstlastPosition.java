package BST_problem;
/*
 * find the target position from first index to last index
 * i/p arr={5,7,7,8,8,10}; target=8
 * o/p [3,4];
 * if array is empty return -1-1
 * 
 */

import java.util.Arrays;

public class _4FirstlastPosition 
{
	public static void main(String[] args) {
	int[] nums= {5,7,7,8,8,10};
	int target=8;
	int [] ans=targetPosition(nums,target);
	System.out.println(Arrays.toString(ans));
	}
	
	//to return the index no of target with the help of search method
	public static int[] targetPosition(int[] nums,int target)
	{
		int[] ans= {-1,-1};
		ans[0]=search(nums,target,true);
		if(ans[0]!=-1)
		{
			ans[1]=search(nums,target,false);
		}
		
		return ans;
		
	}
	
	//to search the target first 
	public static int search(int[] nums,int target,boolean firstindex)
	{
		int ans=-1;
		int start=0;
		int end=nums.length-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(nums[mid]<target)
			{
				start=mid+1;
			}
			else if(nums[mid]>target)
			{
				end=mid-1;
			}
			else
			{
				ans=mid;
				if(firstindex)
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
		}
		return ans;
		
	}
}
