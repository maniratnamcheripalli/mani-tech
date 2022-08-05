package com.stringpractise;

public class StringBuilderExample {
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder();
		sb.append("Mani ");
		sb.append("id is");
		sb.append(": 1955");	
		System.out.println(sb);
		sb.replace(0, 4, "John");
		System.out.println(sb);
		sb.length();
		sb.insert(12,"1922 ");
		System.out.println(sb);
		sb.delete(12, 17);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

	

}
