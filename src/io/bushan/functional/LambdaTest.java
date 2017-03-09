package io.bushan.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import io.bushan.model.User;

public class LambdaTest {
	public static void main(String[] args) {

		// function interface   ( apply method ) 
		
		Function<String,String> function1 = (s) -> {return "Hey "+s;};
		Function<String,String> function2= (s) -> {return "Hi "+s;};
		
		// function 2 is called first and o/p is i/p to function1 
		System.out.println(function1.andThen(function2).apply("Bushan"));
		
		// function 1 is called first then function 2 
		System.out.println(function1.compose(function2).apply("Bushan"));
		
		
		
		// Predicates  takes an input checks the condition return true or false ( test method) 
		
		Predicate<Integer> p = i -> i<50;
		
		System.out.println(p.test(49));
		
		// consumer olny takes value and no out put 
		
		Consumer<String> c = s -> System.out.println(s); 
		c.accept("Print me ");
		
		// print a list with consumer functional interface ( accept method ) 
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) list.add(i);
		
		Consumer<Integer> integer = i -> System.out.println(i);

		list.forEach(integer);
		
		
		list.forEach(new Consumer<Integer>(){
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		
		// supplier has only get method 
		
		Supplier<User> getUser = ()->{return new User();};
		
		Supplier<String> getString = () -> "Hey i am a string";
		
		
		System.out.println(getUser.get());
		System.out.println(getString.get());
		
	}
}
