package com.test.code.hard;

import java.util.Arrays;

// Leetcode problem # 4 

public class MedianOsSortedArrays {

	public static void main(String[] args) {
		
		/*int[] a1 = {3};
		int[] a2 = {-2,-1};
		*/
		int[] a1 = {1,3};
		int[] a2 = {2};
		System.out.println("median ="+findMedianSortedArrays(a1,a2));

	}
	private static double findMedianSortedArrays(int[] a1, int[] a2) {
		
		int m = a1.length;
		int n = a2.length;
		
		if(m>n)
		{
			int[] temp = a1; a1 = a2 ; a2 = temp;
			int tmp=m;m=n;n=tmp;
		}
		
		int iMin = 0, iMax = m,halfLen =(m+n+1)/2;
		while(iMin <= iMax)
		{
			int i = (iMin+iMax)/2;
			int j = halfLen - i;
			if (i < iMax && a2[j-1] > a1[i]){
                iMin = i + 1; // i is too small
            }
            else if (i > iMin && a1[i-1] > a2[j]) {
                iMax = i - 1; // i is too big
            }
            else { // i is perfect
                int maxLeft = 0;
                if (i == 0) { maxLeft = a2[j-1]; }
                else if (j == 0) { maxLeft = a1[i-1]; }
                else { maxLeft = Math.max(a1[i-1], a2[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (i == m) { minRight = a2[j]; }
                else if (j == n) { minRight = a1[i]; }
                else { minRight = Math.min(a2[j], a1[i]); }

                return (maxLeft + minRight) / 2.0;
            }
			
		}
		
	return 0.0;
	}



}
