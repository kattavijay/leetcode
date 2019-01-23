package com.test.code.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		String name = "bbbbb";
		System.out.println(getSubstring(name));
	}

	private static int getSubstring(String name) {
		Set<String> listStrings = new HashSet<String>();
		for (int i = 0; i < name.length(); i++) {
			String temp = "";
			for (int j = i; j < name.length(); j++) {

				if (!temp.contains(name.charAt(j) + "")) {
					temp = temp + name.charAt(j);
				} else
					break;
			}
			listStrings.add(temp);
		}

		int length = 0;
		for (String s : listStrings) {
			if (length <= s.length()) {
				length = s.length();
			}
		}

		return length;
	}

}
