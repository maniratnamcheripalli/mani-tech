package com.practise.inher;
class Animal{
	void a() {
		System.out.println("Good dog");
	}
}
class Dog extends Animal{
	void b(){
		System.out.println("Eating");
	}
}
class Dog1 extends Dog{
	void c() {
		System.out.println("Barking");
		
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Dog1 ac=new Dog1();
		ac.a();
		ac.c();
		ac.b();
		


	}

}
