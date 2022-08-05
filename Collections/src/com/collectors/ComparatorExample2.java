package com.collectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


//Write a program to sort HashMap by value?
public class ComparatorExample2 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"Raju");
		hm.put(50, "Teju");
		hm.put(20,"Man");
		System.out.println(hm);
		ArrayList<Map.Entry<Integer, String>> list=new ArrayList<>(hm.entrySet());

		Collections.sort(list,new Comparator<>(){

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
			
		});
		System.out.println(list);
	}

}
