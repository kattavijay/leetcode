package com.test.code.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoSumTest {

	@Test
	public void test() {
		int[] a = {2, 7, 11, 15};
		int[] r = {2,7};
		TwoSum ts= new TwoSum();
		assertArrayEquals(r, ts.twoSum(a, 9));
		
	}

}
