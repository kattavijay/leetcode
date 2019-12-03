package com.test.code.easy;

import java.util.ArrayList;
import java.util.List;

public class ArrayToInteger {

	public List<Integer> getvalue(int[] a, int k) {
		long temp = 0;
		String tValue = "";

		for (int i = 0; i < a.length; i++) {
			tValue = tValue + Integer.toString(a[i]);
		}

		System.out.println(tValue);
		temp = Long.parseLong(tValue) + k;
		List<Integer> l = new ArrayList<Integer>();

		String value = Long.toString(temp);

		System.out.println(value);

		for (int j = 0; j < value.length(); j++) {
			l.add(Character.getNumericValue(value.charAt(j)));
		}

		return l;
	}

}
