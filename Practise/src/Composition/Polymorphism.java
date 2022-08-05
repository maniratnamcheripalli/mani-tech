package Composition;

public class Polymorphism extends Poly{
	void run() {
		System.out.println("Above main");
	}
	public static void main(String[] args) {
		Poly p=new Polymorphism();
		p.run();
	}

}
