package com.daemonthread;

public class Daemon {

	public static void main(String[] args) {
		
	
		MyThread m=new MyThread();
		m.setDaemon(true);
		m.start();
		//m.setDaemon(true); if we try to make the thread as daemon after it has started it will throw IllegalThreadStateException
		for(int i=0;i<5;i++) {
			System.out.println("Finally");
		}
//		System.out.println("Hello ");
	}

}
