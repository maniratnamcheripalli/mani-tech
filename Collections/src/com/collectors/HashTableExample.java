package com.collectors;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<Integer,String> hashTable =new Hashtable<Integer,String>();
		hashTable.put(1, "Mani");
		hashTable.put(2, "Raju");
		hashTable.put(6, "Deepu");
		hashTable.put(5, "Mani");
		System.out.println(hashTable);
		Set<Integer> se=hashTable.keySet();
		
		for(Integer it:se) {
			System.out.println("Key is "+it+" Value is "+hashTable.get(it));
		}
		System.out.println("*****USing entryset*******");
		for(Map.Entry<Integer, String> it:hashTable.entrySet()) {
	
			System.out.println("Key is "+it.getKey()+" Value is "+it.getValue());
		}


	}

}
