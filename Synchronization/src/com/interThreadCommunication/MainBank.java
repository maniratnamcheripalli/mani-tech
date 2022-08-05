package com.interThreadCommunication;

public class MainBank {

	public static void main(String[] args) {
		Bank c=new Bank();
		Thread t=new Thread() {
		public void run(){
			c.withdraw(5000);
		}    
	};   
	Thread t1=new Thread(){    
	public void run(){
		c.deposit(1000);
		}    
	};
	Thread t2=new Thread(){    
		public void run(){
			c.fun();
		}
	};
	t.start();
	t1.start();
	t2.start();
	}

}
