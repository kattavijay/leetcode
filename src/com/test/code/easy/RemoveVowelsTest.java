package com.test.code.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveVowelsTest {

	@Test
	public void test() {

		String name = "leetcodeisacommunityforcoders";
		String result = "ltcdscmmntyfrcdrs";

		RemoveVowels rv = new RemoveVowels();
		assertEquals(result, rv.removeV(name));
	}

	@Test
	public void test1() {

		String name = "aeiou";
		String result = "";

		RemoveVowels rv = new RemoveVowels();
		assertEquals(result, rv.removeV(name));
	}
}
