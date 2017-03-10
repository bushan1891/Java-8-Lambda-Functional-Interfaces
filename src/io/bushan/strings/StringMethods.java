package io.bushan.strings;

public class StringMethods {
	public static void main(String[] args) {
		
		String s = "This is a test";
		
		int t =s.length();
		System.out.println(t);
		
		int first = s.charAt(0);
		System.out.println(first);
		
		int last = s.charAt(t-1);
		System.out.println(last);
		
		// gets the first "is" index 
		int indexof = s.indexOf("is");
		System.out.println(indexof);
		
		// to get next "is" index
		int indexofsecond = s.indexOf("is" ,3);
		System.out.println(indexofsecond);
		
	}
}
