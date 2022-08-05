package com.practice.basics;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		int b,c;

		System.out.println("enter two numbers");
		Scanner a=new Scanner(System.in);
		b=a.nextInt();
		c=a.nextInt();
		//Arithmetic operators
		System.out.println(b+c +" "+b*c+" "+b/c+" "+b%c);
		
		//Assignment operator
		int d=15;
		int var;
		var =d;
		System.out.println("assignment" +var);
		//*=
		var *=d;
		System.out.println("assignment" +var);
		//*=
		var -=d;
		System.out.println("assignment" +var);
		
		//Relational operators
		System.out.println(b==c);
		System.out.println(b!=c);
		System.out.println(b>=c);
		System.out.println(b<=c);
		System.out.println(b>c);
		System.out.println(b<c);
		//Ternary operator
		System.out.println((b>c)?b:c);
		//Bitwise operator
		System.out.println(b&c);
		System.out.println(b|c);
		System.out.println(b^c);
		System.out.println(~c);
		
		
		
		
		
		
		
		
		

	}

}
