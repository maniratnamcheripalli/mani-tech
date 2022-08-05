package com.collectors;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(1,"Mani");
		tm.put(4,"famous");
		tm.put(2,"actor");
		tm.put(3,"hero");
		System.out.println(tm);
		System.out.println("first entry "+tm.firstEntry());
		System.out.println("Last entry "+tm.lastEntry());
		System.out.println("First key "+tm.firstKey());
		System.out.println("Last key "+tm.lastKey());
		System.out.println("size is "+tm.size());
		tm.remove(2);
		
		System.out.println("After removing "+tm);


		
	}

}
