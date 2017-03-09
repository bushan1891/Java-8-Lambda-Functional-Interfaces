package io.bushan.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
	
	public static void main(String[] args) {
		
		// using forEach for arrayList 
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i =0;i<10;i++) list.add(i);
		
		list.forEach(new Consumer<Integer>(){
			@Override
			public void accept(Integer t) {
				System.out.println("Printing using Foreach "+t);
			}
		});
		
		// you can also pass a class that implements Consumer 
		ConsumerImpl action = new ConsumerImpl();
		list.forEach(action);
		
	}
	
}

class ConsumerImpl implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println("Printing from the ConsumerImpl "+t);
		
	}
	
}
