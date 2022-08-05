package com.collectors;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap <Integer,String> hm=new HashMap<>();
		hm.put(1, "Mani");
		hm.put(2, "burger");
		hm.put(4, "pizza");
		hm.put(3, "kfc");
		hm.put(null, null);
		System.out.println(hm);
		System.out.println(hm.get(2));
		
		
		//retrieve keys and values in hash map
		
		Set<Integer> keys=hm.keySet();
		System.out.println(keys);
		
		Collection<String> value= hm.values();
		System.out.println(value);
		
		//looping
		    // keySet()
		Set<Integer> key=hm.keySet();
		for(Integer ke:key) {
			System.out.println(ke+"   "+hm.get(ke));
		}
		     //EntrySet
		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
		    Integer key1 = entry.getKey();
		    Object value1 = entry.getValue();
		System.out.println("Value of key "+key1+" is: "+value1);
		}
		
		Iterator it=hm.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry pair=(Entry) it.next();
			System.out.println(pair.getKey()+"="+pair.getValue());
			
		}

	}

}
