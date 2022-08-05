package com.sleepthread;

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		MyThread t=new MyThread();
		t.setName("Thread 1");
		MyThread t1=new MyThread();
		t1.setName("Thread 2");
		t.start();
		t.join(5000);
		//t1.start();
		for(int i=0;i<5;i++) {
			System.out.println("Parent");
		}
	}

}
