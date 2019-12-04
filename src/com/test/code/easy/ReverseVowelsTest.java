package com.test.code.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseVowelsTest {

	@Test
	public void test() {
		String value = "hello";
		String result = "holle";
		ReverseVowels rv = new ReverseVowels();
		assertEquals(result, rv.reverseVowels(value));
	}
	
	@Test
	public void test1() {
		String value = "leetcode";
		String result = "leotcede";
		ReverseVowels rv = new ReverseVowels();
		assertEquals(result, rv.reverseVowels(value));
	}

	@Test
	public void test3() {
		String value = "e";
		String result = "e";
		ReverseVowels rv = new ReverseVowels();
		assertEquals(result, rv.reverseVowels(value));
	}
	
	@Test
	public void test4() {
		String value = "ttte";
		String result = "ttte";
		ReverseVowels rv = new ReverseVowels();
		assertEquals(result, rv.reverseVowels(value));
	}
	@Test
	public void test5() {
		String value = "aA";
		String result = "Aa";
		ReverseVowels rv = new ReverseVowels();
		assertEquals(result, rv.reverseVowels(value));
	}
}
