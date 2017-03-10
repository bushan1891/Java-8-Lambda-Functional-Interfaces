package io.bushan.strings;

public class StringTest {
	public static void main(String[] args) {
		
		// string is java is immutable 
		// that is any modification a new instance is created and the reference is changed 
		
		String s1 = "Bushan";  // stored in the string pool 
		String s2 = new String("Bushan"); // stored in the heap area 
	
		// == checks for value equality for the premitive and object reference for Objects;
		System.out.println(s1==s2);     // false 
		
		
		s1.concat("Hey concat me");   // s1 is not changed 
		
		System.out.println(s1);
		
		s1=s1.concat("Hey concat me");
		
		System.out.println(s1);
		
		
		// always use equals to check the equality not == 
		
		System.out.println(s1.equals("BushanHey concat me"));
		
		// string pool
		String s4 = "bushan"; 
		String s3 = "bushan"; 
		
		// IMPORTANT 
		// there is only one copy of "bushan" in string-pool 
		// jvn is samrt to figure out same strings and maintain just one copy
		// but its referenced to two variables in stack 
		
		System.out.println(s4 == s3); // we are checking for the object reference 
		//Stack  // address
 		//s4 		6000
		//s3			6000    
		
		// string pool address 6000 -> "bushan"
	}
}
