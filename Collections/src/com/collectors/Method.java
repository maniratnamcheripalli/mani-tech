package com.collectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Method {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList <String>();
		ArrayList <Integer> list1=new ArrayList<Integer>();
		//adding element into array list
		
		list.add("ManiRatnam");  
		list.add("Rajesh");
		list.add(1,"Rahul");
		list.add("Yeashwanth");
		list.add("Touseff");
		list.add("ManiRatnam");
		list1.add(05);  
		list1.add(15);
		list1.add(80);
		list1.add(30);
		list1.add(1,20);
		list1.add(3);
		System.out.println("Elements in array list  "+list+"  "+list1);
		//removing elements from array list
		
		list.remove(1);
		list.remove("ManiRatnam");
		list1.remove(2);
		System.out.println("Elements in array list after removing  "+list+"  "+list1);
		// replacing object  
		list.set(0,"Vinay");
		list1.set(0,10);
		System.out.println("Elements in array list  "+list+"  "+list1);
		// finding the index of element
		System.out.println("Index of element vinay  "+list.indexOf("Vinay"));
		System.out.println("Index of element 20  "+list1.indexOf(20));
		//size of array list
		
		System.out.println("Size  "+list.size());
		System.out.println("Size  "+list1.size());
		// getting the array list element
		System.out.println("getting the array list element  "+list.get(0));
		System.out.println("getting the array list element  "+list1.get(1));
		
		System.out.println("boolean  "+list.contains("Vinay"));
		System.out.println("Elements in array list  "+list+"  "+list1);
		list.clear();
		System.out.println(list);
		
		//sorting array list
		
		Collections.sort(list1);
		System.out.println("sorted arraylist  "+list1);
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println("Descending order sorted arraylist  "+list1);
		
		//Sub list from array list
		
		List <Integer> sub=list1.subList(1, 5);
		System.out.println("Sublist  "+sub);
	}


}
