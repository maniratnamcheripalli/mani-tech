package com.lambda;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(60);
		al.forEach((a)->System.out.println(a));

	}
}
