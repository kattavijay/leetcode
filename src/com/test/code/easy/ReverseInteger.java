package com.test.code.easy;

public class ReverseInteger {

	public static void main(String[] args) {
		int input = -123;
		
		
		System.out.println(reverseint(input));

	}

	private static int reverseint(int input) {
		int finalValue  = 0;
		int temp = 0,result=0;
		while(input != 0)
		{
			temp = input%10;
			finalValue = finalValue*10+temp;
			if((finalValue-temp)/10!=result)
				return 0;
			result = finalValue;
			input = input/10;
			
			
		}
		
		return finalValue;
	}

}
