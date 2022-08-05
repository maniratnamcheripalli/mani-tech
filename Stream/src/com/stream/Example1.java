package com.stream;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		
		List<Integer> li=Arrays.asList(2,3,5,8,6);
		
	// map method
		
		List<Integer> square=li.stream().map(a->a*a).collect(Collectors.toList());
		System.out.println(square);
		li.stream().map(a->a*a).sorted().forEach(a->System.out.println(a));
		int square2=li.stream().max((a,d)->a.compareTo(d)).get();
		System.out.println("Max "+square2);
		
	// filter
		
		List<String> se=Arrays.asList("Mani","Rahul","Taman");
		
		List<String> se1=se.stream().filter(s->s.startsWith("M")).collect(Collectors.toList());
		System.out.println("filter "+se1);
		
	//Sorted
		
		List<String> se2= se.stream().sorted().collect(Collectors.toList());
		System.out.println(se2);
		
	//
		int even=li.stream().filter(a->a%2==0).reduce(0,(ans,i)->ans+i);
		System.out.println(even);
		

	}
}
