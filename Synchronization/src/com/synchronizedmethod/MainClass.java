package com.synchronizedmethod;

public class MainClass {
	
	public static void main(String[] args) {
		BookSeats b = new BookSeats();
		MovieBookingApp t = new MovieBookingApp(b,7);
		t.start();
		MovieBookingApp t2 = new MovieBookingApp(b,8);
		t2.start();
	}


}
