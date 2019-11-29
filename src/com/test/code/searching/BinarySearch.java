package com.test.code.searching;



public class BinarySearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int[] data = { 12, 24, 67, 71, 99 };
		int key = 10;

		int result = doBonarySearch(data, key);

		if (result == -1) {
			System.out.println("key not found");
		} else {
			System.out.println("key  found");
		}

	}

	private static int doBonarySearch(int[] data, int key) throws InterruptedException {

		int left = 0;
		int right = data.length - 1;
		
		int mid = (left + right) / 2;
		
		while(left<=right)
		{
		if(data[mid]==key)
			return 0;
		
		if(data[mid]<key)
			left = mid +1;
		else
			right = mid -1;
		
		mid = (left+right)/2;
		}
		

		return -1;
	}

}
