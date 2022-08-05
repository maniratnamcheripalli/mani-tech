package com.staticsyncronization;

public class Main {
	
	public static void main(String[] args) {
		Booking b1= new Booking();
		MyThread mt=new MyThread(b1, 7);
		mt.start();
		Threads t=new Threads(b1, 6);
		t.start();
		Booking b2= new Booking();
		MyThread mt1=new MyThread(b2, 8);
		mt1.start();
		Threads t1=new Threads(b2, 5);
		t1.start();
		
		
	}
	
	

}
