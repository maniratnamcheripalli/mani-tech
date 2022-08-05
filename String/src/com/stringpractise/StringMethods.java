package com.stringpractise;

public class StringMethods {

	public static void main(String[] args) {

//indexOf()

		String s = "Java learning is simple";
		System.out.println(s.indexOf("is"));
		System.out.println(s.indexOf("i"));
		System.out.println(s.indexOf("i", 11));
		String sub = "simple";
		System.out.println(s.indexOf(sub, 0));

//length()
		System.out.println(s.length());

//subString()
		System.out.println(s.substring(5, 10));

//startsWith()
		System.out.println(s.startsWith("java"));
//endsWith()
		System.out.println(s.endsWith(sub));
//toUpperCase()
		System.out.println(s.toUpperCase());
//toLowerCase()
		System.out.println(s.toLowerCase());

//valueOF()
		int a = 30;
		float b = 30.25f;
		String c = "Manii";
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(c));
	}

}