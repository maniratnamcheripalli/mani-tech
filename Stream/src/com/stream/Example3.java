package com.stream;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example3 {

	public static void main(String[] args) {
		List<Example2> l = new ArrayList<>();

		l.add(new Example2(1951, 50000f));
		l.add(new Example2(1955, 20000f));
		l.add(new Example2(1956, 30000f));
		l.add(new Example2(1954, 30000f));
		l.add(new Example2(1952, 60000f));
		l.add(new Example2(1953, 80000f));
		Map<Integer, Float> ma = l.stream().collect(Collectors.toMap(p -> p.id, p -> p.getSalary()));
		System.out.println(ma);

		Set<Float> s = l.stream().map(p -> p.getSalary()).collect(Collectors.toSet());
		System.out.println(s);
		l.stream().map(p -> p.id).forEach(p -> System.out.println(p));
		Example2 le = l.stream().max((p, q) -> p.getSalary() > q.getSalary() ? 1 : -1).get();

	}

}
