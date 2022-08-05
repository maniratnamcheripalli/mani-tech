package com.practise.abstraction;
abstract class Vechile{
	abstract void start();
}
class Car extends Vechile{
	void start() {
		System.out.println("car start with key");
	}
}
class Bike extends Vechile{
	void start() {
		System.out.println("bike start with self");
	}
}
public class AbstractMethod {

	public static void main(String[] args) {
		Vechile ve;
		ve=new Car();
		ve.start();
		ve=new Bike();
		ve.start();


	}

}
