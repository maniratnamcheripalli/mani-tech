package com.practise.poly;

public class RuntimePolymorphism {
	public static void main(String[] args) {
		Bank ob;
		ob=new Sbi();
		System.out.println("Sbi "+ ob.interest());
		ob=new Axis();
		System.out.println("Axis "+ ob.interest());
		ob=new Baroda();
		System.out.println("Baroda "+ ob.interest());
		
		
	}

}
class Bank{
	float interest() {
		return 9.5f;
	}
}
class Sbi extends Bank{
	@Override
	float interest() {
		return 7.5f;
	}
}
class Axis extends Sbi{
	@Override
	float interest() {
		return 8.5f;
	}
}
class Baroda extends Axis{
	@Override
	float interest() {
		return 7.5f;
	}

}
