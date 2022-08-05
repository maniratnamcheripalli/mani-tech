package com.methodreference;

interface Message {
	ConstructerReference message(String a);
}
public class ConstructerReference {
	ConstructerReference(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		Message m = ConstructerReference::new;
		m.message("Constructer");
	}

}
