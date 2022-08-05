package com.practise.inter;
interface A{
	public abstract void show();
	//void display(); if i commented this throughs a compile time error
	int a=10;
}

public class Interface implements A {
	public void show() {
		System.out.println("Hello..."+a);
	}
	public void display() {
		System.out.println("Hi...");
	}

	public static void main(String[] args) {
		A ob= new Interface();
		ob.show();
		


	}


}
