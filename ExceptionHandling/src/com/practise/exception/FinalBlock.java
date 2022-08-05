package com.practise.exception;

import java.util.Scanner;

public class FinalBlock {
	public static void main(String [] args)  {
		int d,b;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter two numbers");
		 b=a.nextInt();
		d=a.nextInt();
		try {
			int c=b/d;
			
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			a.close();
			System.out.println("Finally block");
		}
	}

}
