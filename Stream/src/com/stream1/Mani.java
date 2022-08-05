package com.stream1;

import java.util.Optional;

public class Mani {

	public static void main(String[] args) {
		String s;
		Optional<String> p=Optional.ofNullable(s=null);
		if(p.isEmpty()) {
			System.out.println("Hi");
		}else {
			System.out.println("Bye");
		}

	}

}
