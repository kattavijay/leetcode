package com.test.code.easy;

import java.util.HashSet;

public class JewelsandStones {

	public static void main(String[] args) {
		
		System.out.println(numJewelsInStones("z","ZZ"));

	}

	private static int numJewelsInStones(String j, String s) {
		
		char[] jtemp = j.toCharArray();
		char[] stemp = s.toCharArray();
		HashSet<Character> ch = new HashSet<Character>();
		for(char c:jtemp)
		{
			ch.add(c);
		}
		int count = 0;
		if(s.length()<=50 && ch.size() <=50)
		{
			for(char cc:ch)
			{
				for(int i=0;i<stemp.length;i++)
				{
					if(cc==stemp[i])
					{
						count++;
					}
				}
			}
			
		}
		return count;
	}

}
