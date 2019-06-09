package com.test.code.easy;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Biagram {

	public static void main(String[] args) {
		
		
		//String[] finalResult = findOcurrences("we will we will rock you", "we","will");
		//String[] finalResult = findOcurrences("jkypmsxd jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa kcyxdfnoa jkypmsxd kcyxdfnoa","kcyxdfnoa","jkypmsxd");
		String[] finalResult = findOcurrences("ypkk lnlqhmaohv lnlqhmaohv lnlqhmaohv ypkk ypkk ypkk ypkk ypkk ypkk lnlqhmaohv lnlqhmaohv lnlqhmaohv lnlqhmaohv ypkk ypkk ypkk lnlqhmaohv lnlqhmaohv ypkk"
				,"lnlqhmaohv","ypkk");
		
		for(String value:finalResult)
		{
			System.out.println(value);
		} 

	}

public static String[] findOcurrences(String text, String first, String second) {
	
	
	
	ArrayList<String> mylist = new ArrayList<String>();
	//StringTokenizer str = new StringTokenizer(text," ");
	
	String[] data = text.split(" ");
	
	for(int position = 0;position<data.length;position++)
	{
		if(data[position].equals(first) && (position!=data.length-1))
		{
			if((position+1)<=data.length)
			{
				if(data[position+1].equals(second)) {
					
				if((position+2)!=data.length)
				{
					mylist.add(data[position+2]);
				}
				
				
				}
			}
		}
		
	}
	
	//System.out.println(mylist.size());
	String[]  result = new String[mylist.size()];
	int i=0;
	
	for(String name:mylist)
	{
		result[i]=name;
		i++;
	}
	
	return result;
        
    }
}
