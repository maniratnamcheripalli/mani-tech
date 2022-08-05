package com.java;

import java.util.ArrayList;
import java.util.List;


public class Stream {
	public static void main(String[] args) {
		List<Example> l=new ArrayList<>();
		l.add(new Example(1951, 50000f));
		l.add(new Example(1955, 20000f));
		l.add(new Example(1956, 30000f));
		l.add(new Example(1954, 30000f));
		l.add(new Example(1952, 60000f));
		l.add(new Example(1953, 80000f));
		l.stream().map(p->p.id).forEach((p)->System.out.println(p));
		
	}

}
