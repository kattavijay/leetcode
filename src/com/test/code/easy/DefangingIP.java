package com.test.code.easy;

public class DefangingIP {
	
	public String defangingIPaddr(String address)
	{
		String re = "";
		
		for(int i=0;i<address.length();i++)
		{
			char c = address.charAt(i);
			
			if(c=='.')
			{
				re += "[.]";
			}else
				re += c;
		}
		
		//return address.replace(".", "[.]");
		return re;
	}

}
