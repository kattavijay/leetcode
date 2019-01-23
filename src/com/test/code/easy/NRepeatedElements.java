package com.test.code.easy;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class NRepeatedElements {

	public static void main(String[] args) {

		// int[] a = { 1, 2, 3, 3 };
		// int[] a = {2,1,2,5,3,2};
		int[] a = { 5, 1, 5, 2, 5, 3, 5, 4, 1, 2 };
		int n = 0;
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		if (a.length >= 4 && a.length <= 10000 && a.length % 2 == 0) {
			n = a.length / 2;
			for (int i : a) {
				if (i >= 0 && i <= 10000) {
					if (ht.containsKey(i)) {
						int value = ht.get(i);
						ht.put(i, value + 1);
					} else {
						ht.put(i, 1);
					}
				}
			}
		} // end of main if

		Set<Integer> keySet = new HashSet<Integer>();
		keySet = ht.keySet();
		for (int oneValue : keySet) {
			if (n == ht.get(oneValue)) { 
				System.out.println(oneValue);
			}
		}

	}

}
