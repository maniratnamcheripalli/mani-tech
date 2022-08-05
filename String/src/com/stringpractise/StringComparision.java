package com.stringpractise;

public class StringComparision {

	public static void main(String[] args) {

		String s2 = "hava";
		String s1 = "Hava";
		System.out.println(s1 == s2); // compare the object references

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));

		String s3 = new String("Java is simple");
		String s4 = new String("Java is easy");
		System.out.println(s3 == s4); // compare the object references

		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s3.compareTo(s4));

	}

}
