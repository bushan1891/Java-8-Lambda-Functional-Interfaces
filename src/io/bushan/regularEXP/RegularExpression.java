package io.bushan.regularEXP;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		/*
		 * . exactly one 
		 *  \d any digits  [0-9]
		 *  \D on digits   [^0-9]
		 *  \s a white space character [\t \n \xOB \f\r]
		 *  \S non white space [^\s]
		 *  \w word character [a-z A-Z 0-9]
		 */
		
		/*
		 * Quantifier
		 *   * 0 or more 
		 *   ? 1 or 0
		 *   + 1 or more
		 *   {n} exactly n times
		 *   {n,} match atleast n time 
		 *   {n,m} match atleast n time not more than m times 
		 *   
		 * 
		 */
		
		String emailReg = "^[a-z A-Z_.0-9]+@[a-z A-Z]+(\\.[a-z]{2,})+$";
		Pattern pattern = Pattern.compile(emailReg);
		Matcher match = pattern.matcher("bushan@gmail.com.com");
		
		boolean test = Pattern.matches(emailReg, "bushan@gmail.com");
		
		boolean isMatch = match.matches();
		System.out.println(isMatch); 
		System.out.println(test);
		
	}
	
}
