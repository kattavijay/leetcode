package com.test.code.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class DefangingIPTest {

	@Test
	public void test() {
		
		String ip = "1.1.1.1";
		String op = "1[.]1[.]1[.]1";
		
		DefangingIP dp = new DefangingIP();
		assertEquals(op,dp.defangingIPaddr(ip));
	}

	@Test
	public void test1() {
		
		String ip = "255.100.50.0";
		String op = "255[.]100[.]50[.]0";
		
		DefangingIP dp = new DefangingIP();
		assertEquals(op,dp.defangingIPaddr(ip));
	}

}
