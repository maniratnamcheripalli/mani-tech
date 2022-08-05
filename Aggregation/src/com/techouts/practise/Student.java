package com.techouts.practise;

public class Student {
	int id;
	String name;
	Address addr;
	 Student(int id,String name,Address a){
		this.id=id;
		this.name=name;
		addr=a;
	}
	void met() {
		System.out.println(id+" "+name+" "+addr.Hno+" "+addr.city+" "+addr.State);
	}

}
