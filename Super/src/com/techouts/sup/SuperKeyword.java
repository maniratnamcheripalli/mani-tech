

package com.techouts.sup;

class A{
	void show() {
	int a=10;
	System.out.println(a+" ");
	}
	A(int c){
		System.out.println("Parent"+"  "+c);
	}
}
class B extends A{
	int a=12;
	void show() {
		System.out.println(a+" ");
		super.show();
	}
	B(){
		super(10); //to call parametered constructer we need to use super(value)
		System.out.println("Child");
		
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		B ob=new B();
		ob.show();

	}

}
