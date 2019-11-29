package com.test.code.medium;

public class ZigZagConversion {

	public static void main(String[] args) {
		String name = "vijaykumar";
		System.out.println(conversion(name, 3));

	}

	private static String conversion(String s, int numRows) {
		char[] str = s.toCharArray();
		StringBuffer[] sBuffer = new StringBuffer[numRows + 1];
		for (int i = 0; i < sBuffer.length; i++)
			sBuffer[i] = new StringBuffer();
		int j = 1;
		for (int i = 0; i < str.length; i++) {
			if (j > numRows)
				sBuffer[2 * numRows - j].append(str[i]);
			else
				sBuffer[j].append(str[i]);
			if (j == 2 * numRows - 2 || numRows == 1)
				j = 1;
			else
				j++;
		}
		for (int k = 1; k < sBuffer.length; k++) {
			sBuffer[0].append(sBuffer[k]);
		}
		return sBuffer[0].toString();
	}

}
