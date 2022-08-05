package com.practise.binding;
class Student{
	void binding() {
		System.out.println("Hello...");
	}
}
class Bike extends Student{
	@Override
	void binding() {
		super.binding();
		System.out.println("Hi....");
}
}
public class Binding {

	public static void main(String[] args) {
		//Static binding
		Student on1=new Student();
		on1.binding();
		//Dynamic Binding
		Student on2=new Bike();
		on2.binding();
		on2=new Bike();
		on2.binding();
	}

}
