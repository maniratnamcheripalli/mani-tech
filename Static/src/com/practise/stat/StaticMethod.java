package com.practise.stat;

public class StaticMethod {
	int id;
	String name;
	static String collage ="Vignan";
	void fun(int id, String name) {
		this.id=id;
		this.name=name;
		System.out.println(id+" "+name+" "+collage+" ");
	}

	public static void main(String[] args) {
		StaticMethod sa1=new StaticMethod();
		sa1.fun(10,"Varun");
		collage="Brilliant";
		sa1.fun(15,"Taman");
		sa1.fun(15,"Rohan");
	}

}
