package com.test.code.easy;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
		
		
		for(int i=0;i<nums.length;i++)
		{
			int j=0;
			if(nums[j]==target-nums[i])
			{
				return new int[]{nums[j],nums[i]};
			}
		}
		
		throw new IllegalArgumentException("No two sum solution");
	}

}
