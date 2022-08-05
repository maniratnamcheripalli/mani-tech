package com.deadlolck;

public class Dead {

	public static void main(String[] args) {

		final String a = "Mani";
		final String b = "Rajesh";

		Thread t = new Thread() {
			public void run() {
				synchronized (a) {
					System.out.println("Thread 1: locked a " + a);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					synchronized (b) {
						System.out.println("Thread 1: locked b " + b);
					}
				}
			}
		};
		Thread t1 = new Thread() {
			public void run() {
				synchronized (b) {
					System.out.println("Thread 2: locked b " + b);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (a) {
						System.out.println("Thread 2: locked a " + a);
					}
				}
			}
		};
		t.start();
		t1.start();

	}

}
