package com.stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.stream.Example2;

public class TerminalOperators {

	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(10,20,30,40,23,10,20,30);
		System.out.println("***TerminalOperators***");
		System.out.println(al.stream().anyMatch(p -> p % 2 == 0));
		System.out.println(al.stream().allMatch(p -> p % 2 == 0));
		System.out.println(al.stream().noneMatch(p -> p % 2 == 0));
		int e=al.stream().reduce(0,(a,b)->a+b);
		System.out.println("Addiing list "+e);
		System.out.println("*******forEach********");
		al.stream().filter(p -> p > 20).sorted().forEach(p -> System.out.println(p));
		// forEachOrdered
		System.out.println("******forEachOrdered*****");
		al.stream().forEachOrdered(p -> System.out.println(p));

		System.out.println("******Collections******");

		List<Example2> li = new ArrayList<Example2>();
		li.add(new Example2(10, 20000));
		li.add(new Example2(50, 25000));
		li.add(new Example2(30, 12000));
		li.add(new Example2(40, 52000));
		li.add(new Example2(20, 63000));
		double d = li.stream().collect(Collectors.summingDouble(p -> p.getSalary()));
		System.out.println("Sum of salary "+d);
		int i=li.stream().collect(Collectors.summingInt(p->p.getId()));
		System.out.println("Sum of id "+i);
		System.out.println("**********Grouping by****");
		Map<Object, List<Integer>> a=al.stream().collect(Collectors.groupingBy(p->p));
		System.out.println(a);

	}

}
