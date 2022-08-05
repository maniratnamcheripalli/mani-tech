package com.practise.inter;
interface S{
	void run();
}
interface D1{
	void print();
}
public class MultipleInheritance implements S,D1 {
	public void run() {
		System.out.println("running");
	}
	public void print() {
		System.out.println("display");
	}
	public static void main(String[] args) {
		S mu=new MultipleInheritance();
		D1 m=new MultipleInheritance();
		mu.run();
		m.print();
		
	}

}
