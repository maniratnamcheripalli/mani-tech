package com.collectors;

import java.util.HashSet;

public class HashSetExample {
	
	    // Duplication is not possible in hash set
		//null value is  allowed only once
		//insertion order is not preserved

	public static void main(String[] args) {
		HashSet<Integer> ha=new HashSet<>();
		HashSet<String> ha1=new HashSet<>();
		HashSet ha2=new HashSet<>();
		ha.add(10);
		ha.add(20);
		ha.add(30);
		ha.add(40);
		ha1.add("vinay");
		ha1.add("mani");
		ha1.add("charan");
		ha1.add("raju");
		ha2.addAll(ha1);
		ha2.addAll(ha);
		System.out.println(ha+"  "+ha1+" "+ha2);
		
		// Adding duplicate elements
		ha.add(20);
		ha.add(30);
		ha1.add("charan");
		ha1.add("raju");
		ha2.addAll(ha1);
		System.out.println("Duplicate elements added  "+ha+"  "+ha1+" "+ha2);
		//Adding null
		ha1.add(null);
		ha1.add(null);
		ha.add(null);
		ha.add(null);
		ha2.add(null);
		ha2.add(null);
		System.out.println("NUll is added  "+ha+"  "+ha1+" "+ha2);
		System.out.println("Size of different sets  "+ha.size()+"  "+ha1.size()+" "+ha2.size());
		
		// Removing elements 
		ha.remove(40);
		ha1.remove("vinaay");
		System.out.println("Removing objects  "+ha+"  "+ha1+" "+ha2);
		
		//converting to array 
		
		Integer [] ar=new Integer[ha.size()];
		ha.toArray(ar);
		for(Integer ab:ar) {
			System.out.print(ab+" ");
		}
		String ar1 []=new String[ha1.size()];
		ha1.toArray(ar1);
		for(String de:ar1) {
		System.out.println(de+" ");
		
		}
		
		// clear

		ha2.clear();
		System.out.println("Only ha2 object had cleared  "+ha+"  "+ha1+" "+ha2);
		
		System.out.println(ha1.contains("mani"));
		
		// clone
		HashSet cloned= (HashSet)ha.clone();
		System.out.println(cloned+" "+ha);
		
		//isEmpty
		System.out.println(ha2.isEmpty());
	}

}

