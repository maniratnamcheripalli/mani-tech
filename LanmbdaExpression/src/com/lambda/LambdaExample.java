package com.lambda;

interface Lambda {
	void fun(int a, String b);
}

public class LambdaExample {

	public static void main(String[] args) {
		Lambda l = (a, b) -> {
			System.out.println("Emp id & name is " + a + " " + b);
		};
		l.fun(1955, "Mani");
	}

}
