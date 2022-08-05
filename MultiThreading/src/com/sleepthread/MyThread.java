package com.sleepthread;

public class MyThread extends Thread{
	public void run() {
		
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("Handled");
			}
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	
		
	}
	}
