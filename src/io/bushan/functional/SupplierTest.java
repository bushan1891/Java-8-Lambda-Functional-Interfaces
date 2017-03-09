package io.bushan.functional;

import java.util.function.Supplier;

import io.bushan.model.User;

public class SupplierTest {
	public static void main(String[] args) {
		
		// always returns an new instance of a object 
		Supplier<String> s = new Supplier<String>(){
			@Override
			public String get() {
				return "I am a new String";
			}
		};
		
		
		Supplier<User> getUser = ()->{return new User();};
		
		Supplier<String> getString = () -> "Hey i am a string";
		
		System.out.println(getUser.get().toString());
		System.out.println(s.get());
		System.out.println(getString.get());
		
	}
}
