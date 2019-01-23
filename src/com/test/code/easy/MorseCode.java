package com.test.code.easy;

import java.util.HashSet;
import java.util.Set;

public class MorseCode {

	public static void main(String[] args) {
		String[] words = {"vtpke","vngc","vnqr","gbzx","qvdx"};
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		Set<String> s1 = new HashSet<>();
		for (String word : words) {
			String str = "";
			int num = word.length();
			for (int i = 0; i < num; i++) {
				str = str + morse[letters.indexOf(word.charAt(i))];
			}
			s1.add(str);
		}
		System.out.println(s1.size());

	}

}
