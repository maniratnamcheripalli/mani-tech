package com.practice.basics;

public class Variable {
	int a=10;     //instance variable
	static int b= 20; // static variable
	
	static void fun(){
		System.out.println(b);
		b++;
	}
	void non() {
		int c=30; // local variable
		System.out.println(c+" "+a+" "+b);
		c++;
	}

	public static void main(String[] args) {

		Variable d=new Variable();
		Variable.fun();
		Variable.fun();
		b++;
		Variable.fun();
		d.non();
		d.non();
		
	}

}
