package com.staticsyncronization;

public class Threads extends Thread {
	Booking b;
	int size;
	
	public Threads(Booking b, int size) {
		super();
		this.b = b;
		this.size = size;
	}

	public void run() {
		b.bookSeat(size);
	}
}
