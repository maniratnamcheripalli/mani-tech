package com.practise.abstraction;
abstract class Jeep{
	abstract void run();
	abstract void cry();
	
	
	Jeep(){
		System.out.println("change gear");
	}
	void move() {
		System.out.println("vechile is moving");
	}
}
class Bus extends Jeep{
	void run() {
		System.out.println("start with push");
	}
	void cry() {
		System.out.println("cry");
	}
	
}
public class Example{
	public static void main(String [] args) {
		Jeep ca= new Bus();
		ca.run();
		ca.move();
		ca.cry();
	}

}
