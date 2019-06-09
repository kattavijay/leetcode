package com.test.code.easy;

import java.util.Arrays;

public class DistinctArray {

	public static void main(String[] args) {
		int[] input = {0,1};
		Arrays.sort(input);

		if (input[input.length - 1] != input.length)
			System.out.println(input.length);
		else if(input[0]!=0)
			System.out.println("0");
		for(int i=1;i<input.length;i++)
		{
		int expected = input[i-1]+1;
		if(expected!=input[i])
			System.out.println(expected);
		}
		
	}

}
