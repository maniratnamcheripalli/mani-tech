package com.collectors;
import java.util.ArrayList;
import java.util.Collections;


public class ComparableMain {

	public static void main(String[] args) {
		ArrayList<ComparableInterfaceExample> hash=new ArrayList<>();
		ComparableInterfaceExample c=new ComparableInterfaceExample(10,"Mani");
		ComparableInterfaceExample c1=new ComparableInterfaceExample(50,"Raju");
		ComparableInterfaceExample c2=new ComparableInterfaceExample(80,"Arun");
		ComparableInterfaceExample c3=new ComparableInterfaceExample(1,"Taman");
		hash.add(c);
		hash.add(c1);
		hash.add(c2); 
		hash.add(c3);
		hash.add(new ComparableInterfaceExample(50, "tanu"));
		System.out.println(hash);
	
		
		Collections.sort(hash);
		for(ComparableInterfaceExample it:hash) {
			System.out.println(it);
		}

		
	}

}
