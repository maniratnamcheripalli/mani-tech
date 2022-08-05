package com.interThreadCommunication;

public class MyThread extends Thread {
	int t = 0;
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				t = t + 100;
			}
			this.notify();
		}
	}
}
