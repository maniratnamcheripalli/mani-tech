package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainExamle2 {

	public static void main(String[] args) {
		
		List <Example2> li=new ArrayList<Example2>();
		li.add(new Example2(1951,22000f));
		li.add(new Example2(1953,6000f));
		li.add(new Example2(1952,30000f));
		li.add(new Example2(1951,60000f));
		List<Float> fl=li.stream().filter(p->p.getSalary()>10000f).map(p->p.getSalary()).collect(Collectors.toList());
		System.out.println(fl);

	}

}
