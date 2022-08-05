package com.collectors;

import java.util.TreeSet;

public class TreeSetExample {
	//Duplication is not allowed
	//null value is not allowed
	//elements get sorted automatically in ascending order

	public static void main(String[] args) {
		  TreeSet <Integer> ts=new TreeSet<>();
		 // ts.add(null);
		  ts.add(10);
		  ts.add(50);
		  ts.add(10);
		  ts.add(20);
		  ts.add(850);
		  ts.add(30);
		  System.out.println(ts);
		  
		
		

	}

}
