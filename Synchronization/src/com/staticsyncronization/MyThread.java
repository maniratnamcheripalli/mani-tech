package com.staticsyncronization;

public class MyThread extends Thread{
	Booking b;
	int size;
	public MyThread(Booking b, int size) {
		super();
		this.b = b;
		this.size = size;
	}

	public void run() {
		b.bookSeat(size);
	}
	
	
	
}
