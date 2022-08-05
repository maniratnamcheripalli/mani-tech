package com.methodreference;

interface Smile {
	String word(String a);
}

public class InstanceMethod {
	public String met(String g) {
		return g;

	}

	public static void main(String[] args) {
		InstanceMethod va = new InstanceMethod();

		Smile me = va::met;
		System.out.println(me.word("Mani"));

	}

}
