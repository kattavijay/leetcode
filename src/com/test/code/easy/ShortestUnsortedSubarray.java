package com.test.code.easy;

import java.util.Arrays;

// 581 leetcode

public class ShortestUnsortedSubarray {

	public static void main(String[] args) {
		
		int[] input = {2, 6, 4, 8, 10, 9, 15};
		
		System.out.println(getSubArray(input));
		
	}

	private static int getSubArray(int[] input) {
		int[] sinput = input.clone();
		Arrays.sort(sinput);
		int start = sinput.length,end = 0;
		for(int i=0;i<sinput.length;i++)
		{
			if(input[i]!=sinput[i])
			{
				start = Math.min(start, i);
				end = Math.max(end, i);
			}
		}
		
		return (end-start >= 0?end-start+1:0);
	}

}


/* 

Time complexity : O(nlogn)
space complexity : O(n)

*/