package com.test.code.easy;

public class FlippingAnImage {

	public static void main(String[] args) {

		int[][] value = { { 1, 1, 0 }, { 0, 1, 0 } };
		int[][] result = flipAndInvertImage(value);
		for(int[] a:result)
		{
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]);
			}
			System.out.println("");
		}

	}

	private static int[][] flipAndInvertImage(int[][] value) {
		if (value.length >= 1 && value.length <= 20) {
			int aLength = value[0].length;
			
			for(int[] row:value)
			{
				for(int i=0;i<(aLength+1)/2;++i)
				{
					  int tmp = row[i] ^ 1;
		                row[i] = row[aLength- 1 - i] ^ 1;
		                row[aLength - 1 - i] = tmp;
				}
				
			}
		}

		return value;
	}

}
