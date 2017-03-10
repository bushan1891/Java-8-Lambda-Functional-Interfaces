package io.bushan.strings;

public class StringEquality {
	public static void main(String[] args) {
		
		String s1 = new String("Bushan");
		String s2 = new String("Bushan");
		
		System.out.println(s1==s2);      // checks the reference 
		System.out.println(s1.equals(s2)); // checks the value 
		
		String s4="bushan";   // one copy of bushan in string pool
		String s5="bushan";	  // one copy of bushan in string pool 	
		
		System.out.println(s4==s5);         // checks for reference 
		System.out.println(s4.equals(s5)); //checks for value
		
		
		
	}
}
