package io.buhan.wrapper;

public class WrapperClass {
	public static void main(String[] args) {
		
		/*
		 *  Wrapper class is made of three things 
		 *  		> Utility Functions 
		 *  		> Conversion Functions 
		 *  		> Primitive Value 
		 *  	
		 */
		
		int xnum = 5;

		Integer xNum = xnum; // Auto Boxed 
		
		System.out.println(xNum.toString()); // util function 
		
		double dub = 5.000000000333333333333333333333333333333333333331;
		Double wrapperDouble = dub;
		System.out.println(wrapperDouble.doubleValue());
		System.out.println(wrapperDouble.toString());
		
		Character c = 'c';
		
		System.out.println(c.isLowerCase('c'));
	}
}
