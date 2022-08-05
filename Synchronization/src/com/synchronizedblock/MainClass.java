package com.synchronizedblock;

public class MainClass extends Thread {
	static Booking b;
	int seats;
	
	public void run() {
		b.bookSeat(seats);
	}
	
	public static void main(String[] args) {
		b = new Booking();
		MainClass mc = new MainClass();
		mc.seats = 7;
		mc.setName("Mani");
		mc.start();
		MainClass mc1 = new MainClass();
		mc1.seats = 6;
		mc1.setName("Vinay");
		mc1.start();
		
	}
}
