package com.test.code.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseLinkedlistTest {

	@Test
	public void test() {
		ReverseLinkedlist rl= new ReverseLinkedlist();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		ListNode l = rl.reverseList(l1);
		while(l!=null)
		{
			System.out.println(l.val);
			l=l.next;
		}
	}

}
