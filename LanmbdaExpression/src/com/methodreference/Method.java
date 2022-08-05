package com.methodreference;

interface Man {
	float fun(int p);
}

public class Method {
	public static float met(int p){
		return p;
		
	}
	public static void main(String[] args) {
//		Man f = (p) -> {
//			return p;
//		};
//		System.out.println(f.fun(5));
	// reference to method
		
		
		Man l=Method::met;
		System.out.println(l.fun(6));
		
	
	}
}
