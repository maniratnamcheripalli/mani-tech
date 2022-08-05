package com.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.io.IOException;
import java.time.LocalDateTime;


public class BufferedReaders {

	public static void main(String[] args) throws IOException {
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println("Date and time "+dt);
		File file=new File("Reader","FileReader");
		FileReader fr=new FileReader(file);
		long start= System.nanoTime();
		System.out.println("start Time"+start);
		BufferedReader br=new BufferedReader(fr);
		String i;
		while((i=br.readLine())!=null) {
			System.out.println(i);
		}
		br.close();
		fr.close();
		long end=System.nanoTime();
		System.out.println("End time "+end);


	}

}
