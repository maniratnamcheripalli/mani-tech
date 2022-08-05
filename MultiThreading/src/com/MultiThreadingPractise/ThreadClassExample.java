package com.MultiThreadingPractise;

public class ThreadClassExample {
	public static void main(String[] args) {
		ThreadClass te=new ThreadClass();
		te.start();
		for(int i=0;i<5;i++) {
			System.out.println("Parent thread");
		}
		
	}

}
