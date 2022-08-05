package com.practise.inher;
class Animals{
	void a() {
		System.out.println("Good dog");
	}
}
class Dog2 extends Animals{
	void b(){
		System.out.println("Eating");
	}
}
class Dog3 extends Animals{
	void c() {
		System.out.println("Barking");
		
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Dog3 ac=new Dog3();
		ac.a();
		ac.c();

	}

}
