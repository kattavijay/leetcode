package com.test.code.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortArrayParity {

	public static void main(String[] args) {

		int[] iArray = { 3, 1, 2, 4 };

		int[] result = sortArrayByParity(iArray);

		for (int i : result) {
			System.out.println(i);
		}

	}

	private static int[] sortArrayByParity(int[] iArray) {

		if (iArray.length >= 1 && iArray.length <= 5000) {

			return IntStream.concat(Arrays.stream(iArray).filter(value -> value % 2 == 0),
					Arrays.stream(iArray).filter(value -> value % 2 != 0)).toArray();

		}

		return null;
	}

}
