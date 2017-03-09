package io.bushan.primitives;

public class Primitives {
	public static void main(String[] args) {
		int i =-2000000000; //   -2,147,483,648 to 2,147,483,647 32bit
		short j = 32767; //  -32,768 to 32,767 16 bit 
		byte k=-128;  // 8 bit signed -128 127
		long l=-9223372036854775807L;  // 64-bit // remember to add L in the end
		
		// proper way 
		long l1=9000000;
		long l2=9000000;
		long r =l1*l2;
		
		int i1=9000000;
		int i2=9000000;
		int r3 =i1*i2;
		
		
		System.out.println(r);
		System.out.println(r3);
		
		
		double m= Math.pow(2, 128);
	}
}
