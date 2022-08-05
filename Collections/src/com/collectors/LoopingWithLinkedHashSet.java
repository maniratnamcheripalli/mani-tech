package com.collectors;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LoopingWithLinkedHashSet {

	public static void main(String[] args) {
		// enhanced for loop
		LinkedHashSet <Integer> lhs=new LinkedHashSet<>();
		lhs.add(50);
		lhs.add(20);
		lhs.add(60);
		for(Integer a:lhs) {
			System.out.println(a);
		}
		
		Iterator it= lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		

	}

}
