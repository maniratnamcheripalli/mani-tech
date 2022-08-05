package com.interThreadCommunication;

public class InterThread {
	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		mt.start();
		System.out.println("Before adding"+mt.t);
		synchronized (mt) {
			mt.wait();
		}
		System.out.println("After adding " + mt.t);
		

	}

}
