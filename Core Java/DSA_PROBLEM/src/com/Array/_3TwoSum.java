package com.Array;

import java.util.HashMap;
import java.util.Map;
//two sum problem
 //leetcode
//https://leetcode.com/problems/two-sum/
 
public class _3TwoSum {
	public static void main(String[] args) {
		int arr[] = { 3,4,3 };
		int target = 6;
		int[] result = twoSum(arr, target);
		System.out.println("[" + result[0] + "," + result[1] + "]");
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> m = new HashMap<>();
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (m.containsKey(target - nums[i])) {
				result[1] = i;
				result[0] = m.get(target - nums[i]);
			}
			m.put(nums[i], i);
		}
		return result;

	}

}
