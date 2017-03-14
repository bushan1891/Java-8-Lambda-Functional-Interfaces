package io.bushan.date;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
			Date d = new Date();   // gives the current time by default 
			long l = d.getTime();  // retruns a time stamp calculated from jan 1 1970
			
			System.out.println(l);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date d2 = new Date(); 
			long l2 = d2.getTime();
			System.out.println(l2);
			long l3= l2-l;
			
			System.out.println("elspsed l1 to l2 :"+l3/1000);
			
			//date compare 
			
			int com = d2.compareTo(d);  //returns  1 , 0 , -1
			// 1 if greater 
			// -1 if lesser 
			// 0 if its equal 
			System.out.println(com);
			
			// use after and before methods to find date
			
	}
}
