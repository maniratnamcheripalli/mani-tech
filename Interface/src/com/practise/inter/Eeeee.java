
package com.practise.inter;
interface Z{
	void show();
	void display();
	int a=10;
}

class Y implements Z{
	public void show() {
		System.out.println("Hello..."+a);
	}
	public void display() {
		System.out.println("Hi...");
	}
	

}

public class Eeeee{
	public static void main(String[] args) {
		Y ob=new Y();
		ob.show();
		ob.display();
		
		
	}
}