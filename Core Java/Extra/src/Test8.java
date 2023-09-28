import java.util.ArrayList;
import java.util.Stack;

public class Test8 {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 2 };
		System.out.println(findDuplicate(nums));

	}

	public static int findDuplicate(int[] nums) {
		int slow=nums[0];//1
		int fast=nums[0];//1
		slow=nums[slow];//3
		fast=nums[nums[fast]];//2
		while(slow!=fast)
		{
			slow=nums[slow];//2
			fast=nums[nums[fast]];//2
		}
		slow=nums[0];//1
		while(slow!=fast)
		{
			slow=nums[slow];//3//2
			fast=nums[fast];//4//2
		}
		return slow;
		
	}

}
