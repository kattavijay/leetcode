package com.test.code.easy;

/*
 *  https://leetcode.com/problems/squares-of-a-sorted-array/  
 * 
 */

import java.util.Arrays;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-4,-1,0,3,10};
				int[] sortedArray = sortedSquares(a);
				for(int i:sortedArray)
				{
					System.out.println(i);
				}
				
	}
	
	public static int[] sortedSquares(int[] a)
	{
		int[] b = new int[a.length];
		
		if(a.length>=1 && a.length<=10000)
		{
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>= -10000 && a[i] <= 10000)
				{
				int j = (int) Math.pow(a[i], 2);
				b[i]=j;
				}else
				{
					return null;
				}
			}
			
			Arrays.sort(b);
			
		}else
		{
			return null;
		}
		
		return b;
	}

}
