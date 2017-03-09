package io.bushan.functional;

import java.util.function.Function;

public class FucntionalExample1 {

	public static void main(String[] args) {
		Function<String, Integer> count = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
			 	System.out.println("called Count function");
				
				return t.split(" ").length;
			}
		};

		Function<String, String> numToString = new Function<String, String>() {
			@Override
			public String apply(String t) {
				System.out.println("called numToString function");
				switch (t) {
				case "four":
					return "hey how are you";
				case "two":
					return "Send more";
				}
				return "this is a demo";
			}

		};

		
		int test = numToString.andThen(count).apply("four");
		int test2=count.compose(numToString).apply("four");
		System.out.println(test + test2);
		
	


	}

}
