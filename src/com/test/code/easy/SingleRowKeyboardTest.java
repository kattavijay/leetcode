package com.test.code.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingleRowKeyboardTest {

	@Test
	public void test() {
		String keyboard = "abcdefghijklmnopqrstuvwxyz";
		String key = "cba";
		SingleRowKeyboard sr = new SingleRowKeyboard();
		
		assertSame(4,sr.calculateTime(keyboard, key) );
	}
	
	@Test
	public void test1() {
		String keyboard = "pqrstuvwxyzabcdefghijklmno";
		String key = "leetcode";
		SingleRowKeyboard sr = new SingleRowKeyboard();
		
		assertSame(73,sr.calculateTime(keyboard, key) );
	}


}
