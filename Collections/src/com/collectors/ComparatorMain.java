package com.collectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorMain {

	public static void main(String[] args) {
		ArrayList<ComparatorExample> list = new ArrayList<>();
		ComparatorExample e = new ComparatorExample(10, "Tanu");
		ComparatorExample e1 = new ComparatorExample(90, "Manu");
		ComparatorExample e2 = new ComparatorExample(120, "Kiran");
		ComparatorExample e3 = new ComparatorExample(50, "Roja");
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);
		Collections.sort(list, new Comparator<>() {
			@Override
			public int compare(ComparatorExample o1, ComparatorExample o2) {
				return o1.getId() - o2.getId();
			}
		});
		System.out.println("*******Sorted by id*******");
		System.out.println(list);
		Collections.sort(list, new ComparatorName());
		System.out.println("*******Sorted by name****");
		System.out.println(list);

	}

}
