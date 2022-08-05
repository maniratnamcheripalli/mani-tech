
package com.practise.finalkeyword;
class Ball{
	final void sun() {
		System.out.println(" print hello");
}
	void funny() {
		System.out.println("Hi...");
	}
}
public class FinalMethod extends Ball{
	void funny() {
		super.funny();
		System.out.println("Hi...");
	}
	// we cannot override final method
	/*void sun() {         
		System.out.println(" print hello");
}*/

	public static void main(String[] args) {
		Ball ba;
		ba=new FinalMethod();
		ba.funny();
		ba.sun();

	}

}
