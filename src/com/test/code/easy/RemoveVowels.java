package com.test.code.easy;

import java.util.ArrayList;
import java.util.List;

public class RemoveVowels {

	public String removeV(String s) {
		char[] c = s.toCharArray();
		String result = "";
		for (int index = 0; index < c.length; index++) {
			if (!isVowel(c[index])) {
				result += c[index];
			}

		}

		return result;
	}

	private boolean isVowel(char c) {

		List<Character> data = new ArrayList<>();
		data.add('a');
		data.add('e');
		data.add('i');
		data.add('o');
		data.add('u');

		return data.contains(c);
	}

}
