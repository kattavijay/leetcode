package com.test.code.medium;

public class AddTwoLL {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {

		AddTwoLL llist = new AddTwoLL();

		// 2->4->3
		llist.head = new Node(2);
		Node second = new Node(4);
		Node third = new Node(3);

		llist.head.next = second;
		second.next = third;

		// 5->6->4

		AddTwoLL llistTwo = new AddTwoLL();
		llistTwo.head = new Node(5);
		Node lSecond = new Node(6);
		Node lThird = new Node(4);

		llistTwo.head.next = lSecond;
		lSecond.next = lThird;
		
		Node finalNode = addTwoNumbers(llist.head,llistTwo.head);
		
		while(finalNode!=null)
		{
			System.out.println(finalNode.data);
			finalNode = finalNode.next;
		}

	}

	private static Node addTwoNumbers(Node l1, Node l2) {
		
		Node dummyNode = new Node(0);
		
		Node p = l1, q = l2, curr = dummyNode;
		int carry = 0;
		while(p!=null || q!=null)
		{
		int x = (p!=null)?p.data:0;	
		int y = (q!=null)?q.data:0;
		int sum = carry + x + y;
		System.out.println("sum="+sum);
		carry = sum/10;
		System.out.println("carry="+carry);
		curr.next = new Node(sum % 10);
		System.out.println(sum%10);
        curr = curr.next;
		if(p!=null)p=p.next;
		if(q!=null)q=q.next;
		}
		if(carry > 0)
		{
			curr.next = new Node(carry);
		}
		return dummyNode.next;
	}

}
