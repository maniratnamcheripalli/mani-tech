package com.stringpractise;

//String concatenation
public class StringExample {

	public static void main(String[] args) {
		String s1 = "Mani";
		String s2 = "Raju";
		// String is immutable
		System.out.println(s1);
		String s3 = s1 + s2; // 1st way
		String s4 = s1.concat(s2); // 2nd way
		System.out.println(s3 + "...." + s4);
		StringBuffer sb = new StringBuffer(); // 3rd way
		sb.append("Mani");
		sb.append("is");
		sb.append("good");
		System.out.println("String Buffer is mutable" + "..." + sb);
		StringBuilder sb1 = new StringBuilder(); // 4th way
		sb1.append("Mani");
		sb1.append("is");
		sb1.append("good");
		System.out.println("String Builder is mutable" + "..." + sb1);

	}

}
