package io.bushan.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import io.bushan.model.User;

public class UsingOperator {
	public static void main(String[] args) {
		
		Supplier<User> userFactory = User::new;   // invokes the User constructor
		
		System.out.println(userFactory.get().getEmail());
		User user = userFactory.get();
		
		// using a instance variable 
		Function<User,String> userFucntion = user::printUser;
		
		System.out.println(userFucntion.apply(user));
		
		// invoking a static method
		Supplier<String> staticString = User::staticMethod;
		System.out.println(staticString.get());
		
		
		// calling the static method 
		Predicate<String> u = User :: staticMethodtwo; 
		System.out.println(u.test("Test"));
		
		
		// using consumer 
		
		Consumer consumer  = user :: getPhone;
		
		
	} 
	
}
