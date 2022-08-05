package com.synchronizedblock;

public class Booking {

	int t = 10;

	void bookSeat(int a) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		synchronized (this) // synchronized block
		{	
			if (t >= a) {
				System.out.println(a + " Tickets are booked ");
				t = t - a;
				System.out.println("Available tickets are " + t);
			} else {
				System.out.println("sorry your ticket is not booked");
				System.out.println("Available tickets are " + t);
			}
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
	}

}
