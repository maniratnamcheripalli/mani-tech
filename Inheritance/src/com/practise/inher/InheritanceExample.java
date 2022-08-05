package com.practise.inher;
class fun{
	void fun1() {
		System.out.println("Parent class");
	}
}
public class InheritanceExample extends fun {
	void fun2() {
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		InheritanceExample in= new InheritanceExample();
		in.fun1();
		in.fun2();	

	}

}
