package com.practise.modifier;
// modifiers are four types:   public,private,default,protected
class Accept{

	void raj(){
		System.out.println("djnbsu");
		
	}
}

public class Modifier {

	public static void main(String[] args) {
		Accept ac=new Accept();
		ac.raj();
		

	}

}
/* output

compile time error

default method is valid in interface*/