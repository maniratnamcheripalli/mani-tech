package com.stream1;

import java.util.StringJoiner;

public class StringJoinerMethod {

	public static void main(String[] args) {
		
		StringJoiner st=new StringJoiner(",");
		st.add("Rahul");
		st.add("Mani");
		System.out.println("Length "+st.length());
		String st1=st.toString();
		System.out.println("Char at specified index "+st1.charAt(1));
		
		StringJoiner str1=new StringJoiner(",","[","]");
		str1.add("Vinay");
		str1.add("Yaashwanth");

		StringJoiner str2= str1.merge(st);
		System.out.println("Lenth after merge "+str2.length());
	
	}

}
