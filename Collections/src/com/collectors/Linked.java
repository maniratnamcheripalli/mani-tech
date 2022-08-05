package com.collectors;

import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		LinkedList <Integer> linked =new LinkedList<Integer>();
		LinkedList <String> linked1 =new LinkedList<String>();
		linked.add(10);
		linked.add(1,80);
		linked.addFirst(20);
		linked.addLast(50);
		System.out.println(linked);
		linked1.add("Deep");
		linked1.add(1,"raju");
		linked1.addFirst("vishnu");
		linked1.addLast("taman");
		System.out.println("Added elements in list  "+linked1);
		// getting elements from list
		System.out.println(linked.get(0));
		System.out.println(linked.getFirst());
		System.out.println(linked.getLast());
		int o=linked.poll();
		int a=linked.remove();
		System.out.println("poll element  "+o);
		System.out.println("remove element"+a);
		System.out.println("Index "+linked.indexOf(20));
	

	}

}
