package com.daemonthread;

public class MyThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		
	}

}
