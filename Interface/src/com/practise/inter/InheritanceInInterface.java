package com.practise.inter;

interface Zeb{
	void show();
}
interface B extends Zeb
{
	void print();
}
public class InheritanceInInterface implements B  {
	

	public static void main(String[] args) {
		
		B b=new InheritanceInInterface();
		b.print();
		b.show();


	}

	@Override
	public void show() {
		System.out.println("hi  ");
		
	}

	@Override
	public void print() {
		System.out.println("Heuw  ");
		
	}

}
