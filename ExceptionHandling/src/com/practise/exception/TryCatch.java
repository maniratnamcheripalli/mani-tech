package com.practise.exception;

public class TryCatch {

	public static void main(String[] args) {
		int i=100;
		int j=0;
		try {
			System.out.println("try block");
			int a=i/j;
			System.out.println("Rest of the code will not execute");
		}
		catch(Exception e) {
			System.out.println("code in catch block");
			System.out.println(e);
			
		}
		finally {
			int a=i/(j+2);
			System.out.println(a);
		}
		System.out.println("code out of catch block");

	}

}
