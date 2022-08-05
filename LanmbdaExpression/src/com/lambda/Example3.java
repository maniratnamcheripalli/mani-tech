package com.lambda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Example3 {
	public static void main(String[] args) {
		
		HashMap<Integer,String> ha=new HashMap<>();
		ha.put(1,"Map");
		ha.put(2,"Google");
		ha.put(3, "Techouts");
		System.out.println(ha);
		ArrayList<Map.Entry<Integer, String>> al=new ArrayList<>(ha.entrySet());
		
		//Using comparator
		
//		Collections.sort(al,new Comparator<>() {
//
//			@Override
//			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
//				return o1.getValue().compareTo(o2.getValue());
//			}
//
//		});System.out.println(al);
		
		// using Lambda expression
		
		Collections.sort(al, (p1, p2) -> {
			return p1.getValue().compareTo(p2.getValue());
		});
		System.out.println(al);
	}

}
