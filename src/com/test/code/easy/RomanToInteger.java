package com.test.code.easy;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		String input = "IV";
		// String input = "III";
		System.out.println("Final result=" + parseRoman(input));

	}

	private static int parseRoman(String input) {
		int result = 0;
		int lenght = input.length() - 1;
		while (lenght >= 0) {
			int temp = getValue(input.charAt(lenght));

			if (lenght > 0) {
				if (getValue(input.charAt(lenght - 1)) < temp) {

					result = (temp - getValue(input.charAt(lenght - 1))) + result;
					lenght = lenght - 2;

				} else {
					result = temp + result;
					lenght = lenght - 1;

				}

			} else {
				result = temp + result;
				lenght = lenght - 1;

			}

		}

		return result;
	}

	private static int getValue(char c) {

		HashMap<Character, Integer> roman = new HashMap<>();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);

		return roman.get(c);
	}

}
