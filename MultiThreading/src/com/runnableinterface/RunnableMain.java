package com.runnableinterface;

public class RunnableMain {

	public static void main(String[] args) {
		MyThread mt=new MyThread();
		Thread t=new Thread(mt,"My name");
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Parent Thread");
		
		}
		System.out.println(t.getName());


	}

}
