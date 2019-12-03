package com.test.ds.practice;


// Last in first out   - LIFO

import java.util.*; 
public class StackTest {

	public static void main(String[] args) {
	
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<5;i++)
			stack.push(i);
		
		for(int j=0;j<stack.size();j++)
			System.out.println(stack.pop());

	}

}
