package com.test.code.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntersectionArrayTest {

	@Test
	public void test() {
		IntersectionArray ar = new IntersectionArray();
		int[] a = {1,2,2};
		int[] b = {2,3};
		int[] r = {2};
		
		assertArrayEquals(r, ar.intersection(a, b));
	}

	@Test
	public void test1() {
		IntersectionArray ar = new IntersectionArray();
		int[] a = {1,2,2,1};
		int[] b = {2,2};
		int[] r = {2};
		
		assertArrayEquals(r, ar.intersection(a, b));
	}

	@Test
	public void test2() {
		IntersectionArray ar = new IntersectionArray();
		int[] a = {4,9,5};
		int[] b = {9,4,9,8,4};
		int[] r = {4,9};
		
		assertArrayEquals(r, ar.intersection(a, b));
	} 
	@Test
	public void test3() {
		IntersectionArray ar = new IntersectionArray();
		int[] a = {};
		int[] b = {1,1};
		int[] r = {};
		
		assertArrayEquals(r, ar.intersection(a, b));
	} 
	@Test
	public void test4() {
		IntersectionArray ar = new IntersectionArray();
		int[] a = {4,7,9,7,6,7};
		int[] b = {5,0,0,6,1,6,2,2,4};
		int[] r = {6,4};
		
		assertArrayEquals(r, ar.intersection(a, b));
	} 

}
