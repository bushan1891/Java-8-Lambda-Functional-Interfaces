package io.bushan.regularEXP;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractGroups {
	public static void main(String[] args) {
		
		// regular expression to get the protocol and host and domain 
		
		String regExp = "^(http(s)?)?://(www)?\\.([a-z A-Z 0-9]+)\\.[a-z]{2,}(\\/[a-z 0-9]+)*";
	
		Pattern p = Pattern.compile(regExp);
		Matcher match = p.matcher("https://www.google.com/bushan");
		boolean isValid = match.matches();
		if(isValid){
			System.out.println("Protocol is : " + match.group(1));
			System.out.println("Host name of the url is :"+ match.group(4));
			System.out.println("Path url is : " + match.group(5));
		}
		
		
	}
}
