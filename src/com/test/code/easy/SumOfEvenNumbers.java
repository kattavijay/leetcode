package com.test.code.easy;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int queries[][] = {{1,0},{-3,1},{-4,0},{2,3}};
		int iArray[] = {1,2,3,4};
		
		int value[] = sumEvenAfterQueries(iArray,queries);
		
		for(int s:value)
		{
			System.out.println(s);
		}
	}

	private static int[] sumEvenAfterQueries(int[] iArray, int[][] queries) {
		int rValue[] = new int[iArray.length]; 
		int tValue[] = iArray;
		
		for(int i=0;i<queries.length;i++)
		{
			
		
			int value =queries[i][0];
			int index=queries[i][1];
			tValue[index] = tValue[index]+ value;
			
			int sum = 0;
			
			for(int v:tValue)
			{
				
				if(v%2==0)
				{
					//System.out.println("v="+v);
					sum = sum + v;
				}
			}
			
			rValue[i] = sum;
		}
		return rValue;
	}

}
