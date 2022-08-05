package com.practice.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Datatypes {

	public static void main(String[] args) {
		/*premitive data types
		int a=1000;
		short c=50;
		char b='m';
		float d=5.25f;
		double e=2.595d;
		byte f= 20;
		System.out.println(a+"  "+b+" "+c+" "+d+" "+e+" "+f);*/
		
		//String
		String g="mani is good";
		System.out.println(g);
		System.out.println(g.length());
		System.out.println(g.toUpperCase());
		System.out.println(g.toLowerCase());
		System.out.println(g.indexOf("is"));
		//array
		
		
		int [] j= {10,20,30,40,50};
		System.out.println(j[1]);
		// Taking input to array
		int[] h=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		for(int i=0;i<5;i++) {
			h[i]=sc.nextInt();
		}
		for(int de:h) {
			System.out.println(de+" ");
			
		}
		
		Arrays.sort(h);
		for(int de:h) {
			System.out.println(de+" ");
		}
						
		//Multidimensional Array
		
		/*int z[][]=new int[10][20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		for(int j=0;j<3;j++) {
			for(int k=0;k<2;k++) {
				z[j][k]=sc.nextInt();
				
			}
		}
		for(int j=0;j<3;j++) {
			for(int k=0;k<2;k++) {
				System.out.println(z[j][k]);
				
			}		
		}*/
		

	}

}
