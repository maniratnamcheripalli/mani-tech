package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class MapSort {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"Apple");
		hm.put(2,"Fle");
		hm.put(5,"Dle");
		hm.put(3,"Ele");
		hm.put(7,"Cle");
		List<Entry<Integer,String>> list=new ArrayList<>(hm.entrySet());
		Collections.sort(list,new Comparator<Entry<Integer,String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		for(Entry<Integer,String>e:list) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
