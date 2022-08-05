package com.synchronizedmethod;

public class BookSeats {

	int t = 10;

	synchronized void bookSeat(int a) {
		if (t >= a) {
			System.out.println(a + " Tickets are booked ");
			t = t - a;
			System.out.println("Available tickets are " + t);
		} else {
			System.out.println("your ticket is not booked");
			System.out.println("Available tickets are " + t);
		}
	}

}
