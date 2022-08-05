package com.sleepthread;

public class Officer extends Thread {
	public void run() {
		try {
			System.out.println("Under process");
			Thread.sleep(1000);
			System.out.println("Your licence is issued");
		}catch(Exception e) {
			System.out.println(e);
		}
	}


}
