package com.test.javamix.binary;

public class BinaryUnsigned {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 22;

		int[] a = new int[32];
		int t = 0;
		for (int i = 0; i < 32; i++) {

			if (((n >> i) & 1) != 0) {
				a[t++] = i;
			}
		}

		int ans = 0;
		for (int i = 0; i < t - 1; i++) {
			ans = Math.max(ans, a[i + 1] - a[i]);
		}

		System.out.println(ans);

	}

}
