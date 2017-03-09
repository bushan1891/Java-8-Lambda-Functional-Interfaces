package io.bushan.functional;

import java.util.function.Predicate;

public class PredicateTest {
	
	public static void main(String[] args) {
		
		Predicate<String> p = new Predicate<String>(){
			@Override
			public boolean test(String t) {
				return t.contains("Download");
			}	
		};
		
		Predicate<String> p2 = s -> s.contains("Download"); // using lamda expresions 
		
		String str = " This is a string, Download !"; 
		
		System.out.println(p.test(str));
		
		System.out.println(p2.test(str));
		
	}
}
