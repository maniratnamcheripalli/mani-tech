package com.synchronizedmethod;

public class MovieBookingApp extends Thread {
	BookSeats b;
	int a;
	public MovieBookingApp(BookSeats b, int a) {
		super();
		this.b = b;
		this.a = a;
	}
	@Override
	public void run() {
		b.bookSeat(a);
	}
}
