package com.sleepthread;

public class MainClass {
	public static void main(String[] args)throws InterruptedException{
		TestDrive td=new TestDrive("Thread 1");
		Officer o=new Officer();
		td.start();
		System.out.println(td.getName());
		td.join();
		o.start();
		o.setName("Thread 2");
		System.out.println(o.getName());
		o.join();
		System.out.println("Thank you");
	}

}
