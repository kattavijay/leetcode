package com.test.code.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseVowelsPointersTest {

	@Test
	public void test() {
		String value = "hello";
		String result = "holle";
		ReverseVowelsPointers rv = new ReverseVowelsPointers();
		assertEquals(result, rv.reverseVowels(value));
	}
	
	@Test
	public void test1() {
		String value = "leetcode";
		String result = "leotcede";
		ReverseVowelsPointers rv = new ReverseVowelsPointers();
		assertEquals(result, rv.reverseVowels(value));
	}

	@Test
	public void test3() {
		String value = "e";
		String result = "e";
		ReverseVowelsPointers rv = new ReverseVowelsPointers();
		assertEquals(result, rv.reverseVowels(value));
	}
	
	@Test
	public void test4() {
		String value = "ttte";
		String result = "ttte";
		ReverseVowelsPointers rv = new ReverseVowelsPointers();
		assertEquals(result, rv.reverseVowels(value));
	}
	@Test
	public void test5() {
		String value = "aA";
		String result = "Aa";
		ReverseVowelsPointers rv = new ReverseVowelsPointers();
		assertEquals(result, rv.reverseVowels(value));
	}
}
