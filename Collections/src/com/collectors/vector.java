package com.collectors;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
	
		// Add elements
		vector.add("java");
	        vector.add(1,"c++");
	        vector.add("python");
	        vector.addElement("java");
	        System.out.println("Vector before removing elements");
	        System.out.println(vector);
	        // Remove elements 
	        vector.removeElement("java");
	        vector.remove(0);
	        vector.remove("java");
	        System.out.println("Vector after removing elements");
	        System.out.println(vector);
	        vector.add("java");
	        vector.add(1,"c++");
	        System.out.println(vector);
	        //Getting elements
	        System.out.println(vector.firstElement());
	        System.out.println(vector.elementAt(1));
	        System.out.println(vector.get(2));
	        
	        
	    	Vector<String> vector1 = new Vector<String>();
	        vector1.add("java");
	        vector1.add(1,"c++");
	        vector1.add("raj");
	        vector1.add("tea");
	        System.out.println(vector1);
	        vector.removeAll(vector1);
	        System.out.println(vector);

	}

}
