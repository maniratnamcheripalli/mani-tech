package com.interThreadCommunication;

public class Bank {
	int amount=50000;

	synchronized void withdraw(int i) {
		System.out.println("Entered into bank");
		if(amount>i) {
			System.out.println("Amount withdrawn  "+i);
			try {
				wait();
			}catch(Exception e) {
				
			}
			System.out.println("Thanks");
		}
		
	}

	synchronized void deposit(int i) {
		System.out.println("Deposited Amount "+i);
		try {
			wait();
		}catch(Exception e) {
			
		}	
		System.out.println("Total balance "+amount);
	}
	synchronized void fun() {
		System.out.println("Thanks 1");
		this.notifyAll();	
	}

	

}
