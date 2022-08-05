package com.practise.mani;

import java.util.Scanner;

public class ForEachExample {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		for(int de:a) {
			System.out.println(de);
			
		}

	}

}
