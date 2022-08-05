package com.practise.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		
//		Pattern p=Pattern.compile("ab");
//		Matcher m=p.matcher("ababbbab");
//		while(m.find()) {
//			System.out.println(m.start()+"....."+m.end()+"...."+m.group());
//		}
//		
//		Pattern p=Pattern.compile("");
//		String [] s=p.split("Mani.is good");
//		System.out.println(s.length);
//		for(String s1:s) {
//			System.out.println(s1);
//		}
		Pattern p=Pattern.compile("[^789]{1}[0-9]{9}");
		Matcher m=p.matcher("9948204579");
		System.out.println(m.matches());
		
		
	}

}
