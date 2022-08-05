package com.staticsyncronization;

public class Booking {
	static int t = 20;
	static synchronized void bookSeat(int a) {
		if (t >= a) {
			System.out.println(a + " Tickets are booked ");
			t = t - a;
			System.out.println("Available tickets are " + t);
		} else {
			System.out.println("sorry your ticket is not booked");
			System.out.println("Available tickets are " + t);
		}
	}

}
