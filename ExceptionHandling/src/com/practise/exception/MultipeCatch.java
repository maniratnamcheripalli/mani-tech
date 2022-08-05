package com.practise.exception;

import java.util.Scanner;

public class MultipeCatch {
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		try {
			System.out.println("try block");
			 int a=20/0;
			//int [] b= new int[5];
			//System.out.println(b[10]);
			int c=sc.nextInt();
		//	int i= Integer.parseInt(c);
		}
		catch(ArithmeticException e){
			e.printStackTrace();	
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(NumberFormatException e)  
        {  
			e.printStackTrace();
        } 
     System.out.println("rest of the code");    

	}

}
