package com.practise.poly;
class Animal{
	void run(int a,float b,String c) {
		System.out.println(a+" "+b+" "+c);
		
	}
	void run(int a,double b) {
		
		System.out.println(a+" "+b);
	}
	void run(int a,float b,String c,double d) {
		System.out.println(a+" "+b+" "+c+" "+d);
		
	}
}

public class CompiletimePolymorphism {

	public static void main(String[] args) {
		Animal an=new Animal();
		an.run(10, 20.566d);
		an.run(25, 20.6f,"Mani");
		an.run(25, 20.6f,"Mani",20.589d);
		


	}

}
