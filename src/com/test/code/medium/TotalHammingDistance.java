package com.test.code.medium;

public class TotalHammingDistance {

	public static void main(String[] args) {
		int[] values = { 4, 14, 2 };
		int total = 0;
		for (int i = 0; i < values.length; i++) {
			for (int j = i + 1; j < values.length; j++) {
				total = total + Integer.bitCount(values[i] ^ values[j]);
			}
		}

	}

}
