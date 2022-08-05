package com.sleepthread;

public class TestDrive extends Thread {
	public TestDrive(String t){
		super(t);
	}
	public void run() {
		try {
			System.out.println("Test drive started ");
			Thread.sleep(1000);
			System.out.println("Test drive completed");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
