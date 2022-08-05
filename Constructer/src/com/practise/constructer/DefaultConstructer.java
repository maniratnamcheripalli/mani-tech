package com.practise.constructer;

public class DefaultConstructer {
	int a;
	String b;
	void display() {
		System.out.println("default constructer called  "+a+" "+b);
	}
	

	public static void main(String[] args) {
		DefaultConstructer ob=new DefaultConstructer();
		ob.display();
		Bike sc=new Bike(20,"Raju");
		sc.method();
	}

}

