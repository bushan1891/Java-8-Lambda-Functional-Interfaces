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
		
		// last idex of 
		
		int lastis = s.lastIndexOf("is");
		System.out.println(lastis);
		
		
		// substring methods 
		
		String s2 = s.substring(2, s.length());
		String s3 = s.substring(2);
		System.out.println(s2);
		System.out.println(s3);
		
		// lower case and upper case
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		int i = s.indexOf("test".toLowerCase());
		int i2= s.toLowerCase().indexOf("test".toLowerCase());
		
		System.out.println(i);
		System.out.println(i2);
		
		// replace 
		
		String re = s.replace("test", "Test");
		System.out.println(re);
		
		
		// split method breaks the string based on the regular expression 
		
		String[] s4 = s.split(" ");
		for( String temp : s4){
			System.out.println(temp);
		}
		
		// contains
		boolean b = s.contains("test");
		System.out.println(b);
		
		// count the words 
		int i4=StringMethods.countWords("isisis is sis si si is", "is");
		System.out.println(" Count is :" + i4);
		
		
	}
	
	public static int countWords(String str , String ptr){
		int count=0;
		String temp=str;

		while(temp.contains(ptr)){
			temp = temp.substring(temp.indexOf(ptr)+ptr.length()-1);
			count++;
		}
		return count;
	}
	
	
}
