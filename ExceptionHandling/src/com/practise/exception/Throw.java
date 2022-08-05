package com.practise.exception;

import java.util.Scanner;


public class Throw {
	public static void main(String[] args) {
		int d,b;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter two numbers");
		 b=a.nextInt();
		 d=a.nextInt();
		 if (d==0) {
			 throw new ArithmeticException();
		 }
		 else {
			 System.out.println(b/d);
		 }
	}

}
