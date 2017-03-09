package io.bushan.functional;

import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		
		
		// always returns an new instance of a object 
		Supplier<String> s = new Supplier<String>(){
			@Override
			public String get() {
				return "I am a new String";
			}
		};
		
		
		
		
	}
}
