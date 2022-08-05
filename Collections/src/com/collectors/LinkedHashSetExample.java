package com.collectors;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	//Duplication is not allowed
		//null value is  allowed
		//insertion order is preserved

	public static void main(String[] args) {
		
		LinkedHashSet  lhs=new LinkedHashSet<>();
		lhs.add(null);
		lhs.add(20);
		lhs.add("Mani");
		lhs.add("ufb");
		lhs.add(50);
		System.out.println(lhs);
		
		//adding duplicate elements
		lhs.add("ufb");
		lhs.add(null);
		lhs.add(50);
		lhs.add(20);
		lhs.add(60);
		System.out.println(lhs);
		System.out.println(lhs.contains(60));
		System.out.println("Size is "+lhs.size());
	
		System.out.println(lhs);
		System.out.println(lhs.remove(20));
	}
}
