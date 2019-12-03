package com.test.code.easy;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ArrayToIntegerTest {

	@Test
	public void test() {
		
		ArrayToInteger ai = new ArrayToInteger();
		int[] a = {1,2,3};
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(3);
		l.add(3);
		
		assertEquals(l, ai.getvalue(a, 10));
	}
	@Test
	public void test1() {
		
		ArrayToInteger ai = new ArrayToInteger();
		int[] a = {9,9,9,9,9,9,9,9,9};
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
	
		
		
		assertEquals(l, ai.getvalue(a, 1));
	}
	
	@Test
	public void test2() {
		
		ArrayToInteger ai = new ArrayToInteger();
		int[] a = {9,9,9,9,9,9,9,9,9,9};
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
	
		
		
		assertEquals(l, ai.getvalue(a, 1));
	}
}
