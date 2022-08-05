package com.practise.constructer;

public class ConstructerExample {
	int a;
	float b;
	String c;
	ConstructerExample(int i,float j,String k){
		a=i;
		b=j;
		c=k;
		System.out.println(a+" "+b+" "+c);
	}
	public void fun() {
		System.out.println(a+" "+b+" "+c);
	}
	public static void main(String[] args) {
		ConstructerExample ob=new ConstructerExample(10,50.5f,"mani");
		ob.fun();
	}

}