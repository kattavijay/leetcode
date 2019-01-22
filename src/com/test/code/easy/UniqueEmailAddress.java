package com.test.code.easy;

import java.util.Hashtable;

public class UniqueEmailAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] emails = { "vijayakumar.katta@gmail.com","vijayakumar.katta@g@zon.com","vijaya.kumar.katta@gmail.com","vijaya+kumar.katta@bt.com"};
		Hashtable<String, String>  validemails = new Hashtable<String,String>();
		try {
			for (int i = 0; i < emails.length; i++) {
				String[] list = emails[i].split("@");
				if (emails[i].length() > 1 && emails[i].length() <= 100) {
					if (list.length == 2) {
						String name = list[0].replace(".", "");
						if(name.contains("+"))
						{
							name = name.substring(0, name.indexOf("+"));
						}
						
						validemails.put(name+"@"+list[1], name);
					}
				}

			}

			System.out.println("Count="+validemails.size());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
