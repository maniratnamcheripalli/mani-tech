package com.practise.mani;

import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) {
		int n;
		System.out.println("enter a number");
		Scanner ee=new Scanner(System.in);
		n=ee.nextInt();
		for(int i=0;i<n;i++) {
			if(i==7) {
				continue;
			}
			if(i==n-2) {
				break;
			}
			System.out.println(i);
			
		}
		
	}

}
