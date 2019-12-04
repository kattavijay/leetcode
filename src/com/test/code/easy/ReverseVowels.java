package com.test.code.easy;

import java.util.ArrayList;
import java.util.List;



public class ReverseVowels {

	public String reverseVowels(String s) {

		String result = s;
		char[] temp = s.toCharArray();

		int start = 0, end = s.length() - 1;

		while (start < end) {

			if (isVowel(temp[start])) {
				char startC = temp[start];
				if (isVowel(temp[end])) {
					result = "";
					char endC = temp[end];
					for (int i = 0; i < temp.length; i++) {
						if (start == i) {
							result += endC;
						} else if (end == i) {
							result += startC;
						} else
							result += temp[i];
					}

					start += 1;
					end -= 1;
					temp = result.toCharArray();

				} else {
					end = end - 1;
				}

			} else {
				start = start + 1;
			}
		}

		
		return result.length() > 0 ? result : s;
	}

	public boolean isVowel(char c) {
		List<Character> data = new ArrayList<>();
		data.add('a');
		data.add('e');
		data.add('i');
		data.add('o');
		data.add('u');

		return data.contains(Character.toLowerCase(c));
	}

}
