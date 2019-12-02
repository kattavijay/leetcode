package com.test.javamix.binary;

public class IntToBonary {

	public static void main(String[] args) {

		String s = "";
		int n = 4;

		while (n > 0) {

			s = ((n % 2) == 0 ? "0" : "1") + s;
			
			n = n / 2;

		}
		
		System.out.println(s);

	}

}
