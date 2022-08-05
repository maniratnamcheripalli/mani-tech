package com.java;
interface Mobile{
	void fun();
}

public class Lambda {
	public static void main(String[] args) {
		int a=10;
		Mobile m=()->{
			int b=10+20;
			System.out.println(a+b);
		};
		m.fun();
		
	}
}

