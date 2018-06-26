package com.test.code.hard;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

public class AtomCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String formula = "Mg(OH)2";
	//	String formula = "H2O";
		String formula = "ON(SO3)2";

		System.out.println(formula);
		countOfAtoms(formula);
	}

	private static void countOfAtoms(String formula) {

		
		int length = formula.length();
		char c;
		
		Map<String,Integer> mapOne = new HashMap<String,Integer>();
		
		Map<String,Integer> mapTwo = new HashMap<String,Integer>();
		
		for(int i=0;i<length;i++)
		{
			 c = formula.charAt(i);
			
			if(!Character.isDigit(c))
			{
				if(c == '(' )
				{
				
					int j=i+1;
					
					while(formula.charAt(j)!=')')
					{
						char tempLoop = formula.charAt(j);
						
						if(!Character.isDigit(tempLoop))
						{
						 String keyOne = String.valueOf(tempLoop);						
					     mapOne.put(keyOne, 0);
						}else
						{
							mapOne.put(String.valueOf(formula.charAt(j-1)), Character.getNumericValue(tempLoop));
						}
						j++;
					}
					
					char afterChar = formula.charAt(j+1);
					
					if(Character.isDigit(afterChar))
					{
						int value = Character.getNumericValue(afterChar);
						
						for(String key : mapOne.keySet())
						{
							int tempValue = mapOne.get(key);
							if(tempValue!=0)
							{
								value = tempValue * value;
							}
							mapOne.put(key, value);
						}
					}
				
					
				
					
				}else {
					
					if(c!=')' && c != '(' && !Character.isDigit(c) )
					{
						String keyTwo = String.valueOf(c);
						mapTwo.put(keyTwo, 0);
					}
					
					
				}
			}else
			{
				char tempChar = formula.charAt(i-1);
				if(tempChar!=')' && tempChar != '(')
				mapTwo.put(String.valueOf(tempChar), Character.getNumericValue(c));
			}
		}
		
		for(String keys:mapOne.keySet())
		{
			mapTwo.put(keys,mapTwo.get(keys)+ mapOne.get(keys));
		}
		
		for(String key:mapTwo.keySet())
		{
			System.out.println(key+"-"+mapTwo.get(key));
		}
		
	}

}
