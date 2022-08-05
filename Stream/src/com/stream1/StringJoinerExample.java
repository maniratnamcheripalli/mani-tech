package com.stream1;

import java.util.StringJoiner;

public class StringJoinerExample {
	public static void main(String[] args) {
		StringJoiner str=new StringJoiner(",");
		
		str.add("Rahul");
		str.add("Mani");
	
		
		System.out.println("String joined  "+str);
		StringJoiner str1=new StringJoiner(",","[","]");
		str1.add("Vinay");
		str1.add("Yaashwanth");
		System.out.println(str1);
		
		System.out.println("***String joiner merging***");
		
		StringJoiner str2= str1.merge(str);
		System.out.println(str2);
	}
}