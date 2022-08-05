package com.stringpractise;

public class StringReplace {

	public static void main(String[] args) {
		String st="John is very good. He works very hard. He is very attractive";
		String s2=st.replace("v", "V");
		String s1=st.replace("very", "so");
		System.out.println(s1);
		System.out.println(s2);
		String s3=st.replaceAll("John", "madhu");
		System.out.println(s3);
		String s4=st.replaceAll("[a-z]+","");
		System.out.println(s4);
		String s5=st.replaceFirst("[a-z]+","");
		System.out.println(s5);
		

	}

}
